package presentation;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import service.BLFacadeImplementationService;
import service.BLFacadeInterface;
import service.ConcreteFlight;
import service.ConcreteFlightContainer;

public class FlightBooking extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane = null;
	private JLabel lblDepartCity = new JLabel("Departing city:");
	private JLabel lblArrivalCity = new JLabel("Arrival City");
	private JLabel lblYear = new JLabel("Year:");
	private JLabel lblRoomType = new JLabel("Room Type:");
	private JLabel lblMonth = new JLabel("Month:");
	private JLabel lblDay = new JLabel("Day:");;
	private JLabel jLabelResult = new JLabel();
	private JLabel searchResult = new JLabel();
	private JLabel jLabelWarning = new JLabel();

	private JComboBox departCity;
	private JComboBox arrivalCity;
	private JTextField day = null;
	private JComboBox<String> months = null;
	private DefaultComboBoxModel<String> monthNames = new DefaultComboBoxModel<String>();
	private DefaultComboBoxModel departCityList = new DefaultComboBoxModel();
	private DefaultComboBoxModel arrivalCityList = new DefaultComboBoxModel();

	private JTextField year = null;

	private JRadioButton bussinesTicket = null;
	private JRadioButton firstTicket = null;
	private JRadioButton touristTicket = null;

	private ButtonGroup fareButtonGroup = new ButtonGroup();

	private JButton lookforFlights = null;

	private JComboBox flightList = null;
	private DefaultComboBoxModel<ConcreteFlightContainer> flightListModel = new DefaultComboBoxModel<>();
	private JButton bookFlight = null;

	private Collection<ConcreteFlightContainer> concreteFlightCollection;

	private BLFacadeInterface businessLogic; // @jve:decl-index=0:;

	private ConcreteFlightContainer temp;
	private ConcreteFlight selectedConcreteFlight;
	private static BLFacadeImplementationService wsls;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightBooking frame = new FlightBooking();
					wsls = new BLFacadeImplementationService();
					frame.setBusinessLogic(wsls.getBLFacadeImplementationPort());
					frame.setVisible(true);
					frame.departCityListInitialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Custom operations
	public void setBusinessLogic(BLFacadeInterface g) {
		businessLogic = g;
	}

	private XMLGregorianCalendar newDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return toXMLGregorianCalendar(calendar.getTime());
	}

	private XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date date) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException ex) {
			System.out.println(ex);
		}
		return xmlCalendar;
	}

	/**
	 * Create the frame
	 * 
	 * @return void
	 */
	private FlightBooking() {

		setTitle("Book Flight");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblDepartCity = new JLabel("Depart City");
		lblDepartCity.setBounds(21, 11, 103, 16);
		contentPane.add(lblDepartCity);

		lblYear = new JLabel("Year:");
		lblYear.setBounds(21, 71, 33, 16);
		contentPane.add(lblYear);

		lblMonth = new JLabel("Month:");
		lblMonth.setBounds(117, 71, 50, 16);
		contentPane.add(lblMonth);

		months = new JComboBox<String>();
		months.setBounds(163, 67, 116, 27);
		contentPane.add(months);
		months.setModel(monthNames);

		monthNames.addElement("January");
		monthNames.addElement("February");
		monthNames.addElement("March");
		monthNames.addElement("April");
		monthNames.addElement("May");
		monthNames.addElement("June");
		monthNames.addElement("July");
		monthNames.addElement("August");
		monthNames.addElement("September");
		monthNames.addElement("October");
		monthNames.addElement("November");
		monthNames.addElement("December");
		months.setSelectedIndex(1);

		lblDay = new JLabel("Day:");
		lblDay.setBounds(291, 71, 38, 16);
		contentPane.add(lblDay);

		day = new JTextField();
		day.setText("23");
		day.setBounds(331, 66, 50, 26);
		contentPane.add(day);
		day.setColumns(10);

		lblRoomType = new JLabel("Seat Type:");
		lblRoomType.setBounds(21, 242, 84, 16);
		contentPane.add(lblRoomType);

		jLabelWarning = new JLabel("");
		jLabelWarning.setBounds(138, 104, 185, 14);
		contentPane.add(jLabelWarning);

		bussinesTicket = new JRadioButton("Business");
		bussinesTicket.setEnabled(false);
		fareButtonGroup.add(bussinesTicket);
		bussinesTicket.setBounds(99, 238, 101, 23);
		contentPane.add(bussinesTicket);

		firstTicket = new JRadioButton("First");
		firstTicket.setEnabled(false);
		fareButtonGroup.add(firstTicket);
		firstTicket.setBounds(202, 238, 77, 23);
		contentPane.add(firstTicket);

		touristTicket = new JRadioButton("Tourist");
		touristTicket.setEnabled(false);
		fareButtonGroup.add(touristTicket);
		touristTicket.setBounds(278, 238, 77, 23);
		contentPane.add(touristTicket);

		lookforFlights = new JButton("Look for Concrete Flights");
		lookforFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setText("");
				jLabelWarning.setText("");
				searchResult.setText("");

				flightListModel.removeAllElements(); // This creates an event in the comboBox, calling the event
														// listener and trying to get something from null
				flightList.setEnabled(true);
				try { // Using this try/catch to solve the 6) section
					XMLGregorianCalendar date = newDate(Integer.parseInt(year.getText()), months.getSelectedIndex(),
							Integer.parseInt(day.getText()));
					concreteFlightCollection = businessLogic.getContainerConcreteFlights(
							departCityList.getSelectedItem().toString(), arrivalCity.getSelectedItem().toString(), date);
					
					Iterator<ConcreteFlightContainer> flights = concreteFlightCollection.iterator();
					while (flights.hasNext())
						flightListModel.addElement(flights.next());
					System.out.println("Número de vuelos: " + concreteFlightCollection.size());

					if (concreteFlightCollection.isEmpty())
						searchResult.setText("No flights in that city in that date");
					else
						searchResult.setText("Choose an available flight in this list:");
				} catch (NumberFormatException error) {
					jLabelWarning.setText("Please enter a valid number");
				}
				businessLogic.getConcreteFlights(getWarningString(), getName(), null);
			}
		});

		lookforFlights.setBounds(99, 129, 261, 40);
		contentPane.add(lookforFlights);

		jLabelResult = new JLabel("");
		jLabelResult.setBounds(99, 180, 261, 16);
		contentPane.add(jLabelResult);

		flightList = new JComboBox();
		flightList.setEnabled(false);
		flightList.setBounds(67, 198, 314, 22);
		contentPane.add(flightList);
		flightList.setModel(flightListModel);
		flightList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flightList.getSelectedItem() == null)
					return; // With this, we end the call if the flightListModel/flightList is empty

				temp = (ConcreteFlightContainer) flightList.getSelectedItem();
				selectedConcreteFlight = temp.getConcreteFlight();
				
				//selectedConcreteFlight = (ConcreteFlight) flightList.getSelectedItem();
				System.out.println(temp.toString());
				
				bookFlight.setText("");
				fareButtonGroup.clearSelection();

				if (selectedConcreteFlight.getBussinesNumber() != 0)
					bussinesTicket.setEnabled(true);
				else
					bussinesTicket.setEnabled(false);

				if (selectedConcreteFlight.getFirstNumber() != 0)
					firstTicket.setEnabled(true);
				else
					firstTicket.setEnabled(false);

				if (selectedConcreteFlight.getTouristNumber() != 0)
					touristTicket.setEnabled(true);
				else
					touristTicket.setEnabled(false);
			}
		});

		// JRadioButton enable/disable bookFlight button
		bussinesTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setEnabled(true);
				bookFlight.setText("Book: " + selectedConcreteFlight.toString());
			}
		});

		firstTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setEnabled(true);
				bookFlight.setText("Book: " + selectedConcreteFlight);
			}
		});

		touristTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setEnabled(true);
				bookFlight.setText("Book: " + selectedConcreteFlight);
			}
		});

		bookFlight = new JButton("");
		bookFlight.setEnabled(false);
		bookFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = 0;
				boolean error = false;
				if (bussinesTicket.isSelected()) {
					num = selectedConcreteFlight.getBussinesNumber();
					if (num > 0)
						selectedConcreteFlight.setBussinesNumber(num - 1);
					else
						error = true;
				}
				if (firstTicket.isSelected()) {
					num = selectedConcreteFlight.getFirstNumber();
					if (num > 0)
						selectedConcreteFlight.setFirstNumber(num - 1);
					else
						error = true;
				}
				if (touristTicket.isSelected()) {
					num = selectedConcreteFlight.getTouristNumber();
					if (num > 0)
						selectedConcreteFlight.setTouristNumber(num - 1);
					else
						error = true;
				}
				if (error)
					bookFlight.setText("Error: There were no seats available!");
				else {
					fareButtonGroup.clearSelection();
					bussinesTicket.setEnabled(false);
					firstTicket.setEnabled(false);
					touristTicket.setEnabled(false);
					bookFlight.setText("Booked. #seat left: " + (num - 1));
					businessLogic.register(selectedConcreteFlight);
					flightListModel.removeAllElements();
					flightList.setEnabled(false);
				}
				bookFlight.setEnabled(false);
			}
		});
		bookFlight.setBounds(31, 273, 399, 40);
		contentPane.add(bookFlight);

		year = new JTextField();
		year.setText("2026");
		year.setBounds(57, 66, 50, 26);
		contentPane.add(year);
		year.setColumns(10);

		lblArrivalCity.setBounds(21, 39, 84, 16);
		contentPane.add(lblArrivalCity);

		searchResult.setBounds(67, 180, 314, 16);
		contentPane.add(searchResult);

		departCity = new JComboBox();
		departCity.setBounds(99, 6, 243, 26);
		contentPane.add(departCity);
		departCity.setModel(departCityList);
		departCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrivalCityList.removeAllElements();
				for (String city : businessLogic.getArrivalCitiesFrom(departCity.getSelectedItem().toString())) {
					arrivalCityList.addElement(city);
				}
			}
		});

		arrivalCity = new JComboBox();
		arrivalCity.setBounds(99, 35, 243, 26);
		contentPane.add(arrivalCity);
		arrivalCity.setModel(arrivalCityList);

	}

	private void departCityListInitialize() {
		for (String city : businessLogic.getAllDepartingCities()) {
			departCityList.addElement(city);
		}
	}
	
} // @jve:decl-index=0:visual-constraint="18,9"
