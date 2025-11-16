import java.util.Scanner;

public class NokiaNavigation{
	public static void main(String [] args){

	power();
}
     // here is the method to power off
    public static void powerOff(){
    System.out.print("""
              ----------------------
              | GOODBYE FROM NOKIA |
              |        👋️          | 
              |       3310         |
              |                    |
              |  Have a nice day!  |                 
              ----------------------    
     """);
    }
    
    //method for messages
    public static void messages(){
    System.out.print("""
            
    *********************Messages************************
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10.Service command editor
              Select one of the options above
     """);
    }


    // here is the method used for power
    public static void power(){
    Scanner input = new Scanner(System.in);
    System.out.print("""

             ************************
             * WELCOME FROM NOKIA 🪫️*
             *          🤝️          *
             *                      * 
             *         3310         *
             *                      *
             *  LONG LASTING PHONE  *
             *                      *
             *  Press 00 for menu   *
             ************************                       
    """);

    int displayMenu = input.nextInt();
    if (displayMenu == 00){
    }
    menu();
    }



 // here is the main menu method     
	public static void menu(){

	Scanner input = new Scanner(System.in);

	System.out.println("""

	******************Welcome to Nokia******************
	
	            List of menu options
	            1.  Phone book
	            2.  Messages
	            3.  Chat
	            4.  Call register
	            5.  Tones
	            6.  Settings 
	            7.  Call divert
	            8.  Games
	            9.  Calculator
	            10. Reminders
	            11. Clock
	            12. Profiles
	            13. SIM services
               🔘️ Enter 14 to power off the phone

	Please select an option from 1 - 13 above.
	""");

	int mainMenu = input.nextInt();

	switch(mainMenu){
    
    case 14 -> powerOff();
    case 0 -> menu();
	case 1 -> {

    System.out.print( """
    **********************Phonebook************************
	            1. Search
	            2. Service Nos.
	            3. Add name
	            4. Erase
	            5. Edit
	            6. Assign tone
	            7. Send b'card
	            8. Options
	            9. Speed dials
	            10. Voice tags
	            
	Select any of the options above or
    Press 0 to go back.
	""");
    int options = input.nextInt();
    switch(options){
    case 0 -> menu();
      case 1 -> System.out.println("Search");
        case 2 -> System.out.println("Service Nos.");
          case 3 -> System.out.println("Add name");
            case 4 -> System.out.println("Erase");
              case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Assign tone");
                  case 7 -> System.out.println("Send b'card'");
                    case 9 -> System.out.println("Speed dials");
                      case 10 -> System.out.println("Voice tags");
                        case 8 -> { System.out.print( """
    **********************Options************************
    
                1. Type of view
                2. Memory status  
    Select from the options above or enter 0 to go back.  
    """);
  
    int typeOfView = input.nextInt();
    switch(typeOfView){
    // opptions

    case 0 -> menu();
      case 1 -> {System.out.println("Type of view. Enter 0 to go return to main menu");
        
        int back = input.nextInt();
        if(back == 0){
            menu();
            }
        
        }
        case 2 -> {System.out.println("Memory status. Enter 0 to return to main menu");
        int back = input.nextInt();
        if(back == 0){
            menu();
            }
            }
            
    }
    }
    }
    }

    case 2 ->
    {
    System.out.print("""
    *********************Messages************************
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10.Service command editor
                Enter 7 for more options.
    """);
    int messageSettings = input.nextInt();
    switch(messageSettings){
    case 0 -> menu();
    case 1 -> System.out.println("Write message");
    case 2 -> System.out.println("Inbox");
    case 3 -> System.out.println("Outbox");
    case 4 -> System.out.println("Picture Messages");
    case 5 -> System.out.println("Templates");
    case 6 -> System.out.println("Smileys");
    case 8 -> System.out.println("Info Services");
    case 9 -> System.out.println("Voice mailbox number");
    case 10 -> System.out.println("Service command editor");
    case 7 -> {System.out.print("""
    *******************Message Settings*******************
                1. Set 1
                2. Common 3
    
    Select option 1 or 2 or enter 0 to go back to main menu
    """);
    int setCommon = input.nextInt();
    switch(setCommon){
    case 0 -> menu();
    case 1 -> {
    System.out.print("""
   **********************Set 1****************************
                1. Message centre number
                2. Messages sent as
                3. Message validity
     Select from the above options or enter the number 0 to go back
    """);
    int set = input.nextInt();
    if(set == 1){
    System.out.print("Message centre number. Please enter 0 to go back"); 
    int back = input.nextInt();
    if(back == 0){
    menu();
    }  
    }else if (set == 2){
    System.out.print("Message sent as");    
    }else if(set == 3){
    System.out.print("Message validity");    
    }else if(set == 0){
    menu();    
    }    
    }
    case 2 -> {
    System.out.print("""
    ***********************Common3************************
                1. Delivery reports
                2. Reply via same centre
                3. Character support
    Select from the options above or enter to return to main menu    
    """);}
    }
    

    }
    
    }

    }

    case 3 -> 
    {
    System.out.print("""
    
             ************************
             * CHATTING WITH BABE   *
             *                      *
             *    HI, HOW ARE U     * 
             *    DOING ❤️          *
             *                      *
             *                      *
             *                      *
             *                      *
             ************************         


    Enter 0 to go navigate to the main menu
    """);
    int back = input.nextInt();
      if (back == 0)
          {menu();
      }
    }

    case 4 -> {
    System.out.print("""
    ***********************Call register******************
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
    """);
    int showCallDuration = input.nextInt();
    switch(showCallDuration){
     case 0 -> menu();
      case 1 -> System.out.println("Missed calls");
        case 2 -> System.out.println("Write message");
          case 3 -> System.out.println("Write message");
            case 4 -> System.out.println("Write message");
              case 5 ->  System.out.print("""
    ******************Show call duration******************
                1. Last call duration
                2. All calls’ duration
                3. Received calls’ duration
                4. Dialled calls’ duration
                5. Clear timers
    """);
    case 6 -> System.out.print("""
    ******************Show call costs*********************
                1. Last call cost
                2. All calls’ cost
                3. Clear counters
    """);
    case 7 -> System.out.print("""
    *****************Call cost settings*******************
                1. Call cost limit
                2. Show costs in
    """);

    case 8 -> System.out.print("""
    ****************Prepaid credit************************
    """);
    }
    }

    case 5 -> {
    System.out.print("""
    ***********************Tones**************************
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
    """);
        int tonesOptions = input.nextInt();
        //cases for Tones in menu 5
       
        switch(tonesOptions){
        case 0 -> menu();
          case 1 -> System.out.println("Ringing Tones");
            case 2 -> System.out.println("Ringing volume");
              case 3 -> System.out.println("Incoming call alert");
                case 4 -> System.out.println("Composer");
                  case 5 -> System.out.println("Method alert tone");
                    case 6 -> System.out.println("Keypad tones");
                      case 7 -> System.out.println("Warning and game tones");
                        case 8 -> System.out.println("Vibrating alert");
                          case 9 -> System.out.println("Screen saver");
        
    }

}
    case 6 -> {
    System.out.print("""
    **********************Settings************************
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
    
    Select from the above options
    """);
    int callSettings = input.nextInt();
    
    switch(callSettings){
    case 0 -> menu();
    case 1 -> 
    {
        System.out.print("""
    *********************Call Settings********************
                1. Automatic redial
                2. Speed dialling
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer 
        """);
    
     int callSettingsOption = input.nextInt();
      //case for call setting option
        switch(callSettingsOption)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Automatic redial");
            case 2 -> System.out.println("Speed dialing");
              case 3 -> System.out.println("Call waiting options");
                case 4 -> System.out.println("Own number sending");
                  case 5 -> System.out.println("Phone line in use");
                    case 6 -> System.out.println("Automatic answer");
        }
    }
    
    case 2 -> 
    {
        System.out.print("""
    *********************Phone settings*******************
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights2
                6. Confirm SIM service actions
    """);
    int phoneSettingsOption = input.nextInt();
      //case for phone setting option
        switch(phoneSettingsOption)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Language");
            case 2 -> System.out.println("cell info display");
              case 3 -> System.out.println("Welcome note");
                case 4 -> System.out.println("Network selection");
                  case 5 -> System.out.println("Lights");
                    case 6 -> System.out.println("Confirm SIM service actions");
        }
    }
    case 3 -> 
    {
      System.out.print("""
     *********************Security settings****************
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
    """);
    int securitySettingsOption = input.nextInt();
      //case for call setting option
        switch(securitySettingsOption)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Pin code request");
            case 2 -> System.out.println("Call barring service");
              case 3 -> System.out.println("Fix dialing");
                case 4 -> System.out.println("Closed user group");
                  case 5 -> System.out.println("Phone security");
                    case 6 -> System.out.println("Change access codes");
        }
    }
    case 4 -> 
    {
     System.out.print("""
    *******************Restoring factory settings*********** 
    """);
    int restoreFactory = input.nextInt();
      //case for call setting option
        switch(restoreFactory)
        {
         case 1 -> System.out.println("Restore factory settings");
            
        }
    }
    }
    }

    case 7 -> 
    {
    System.out.print("Call divert");
    int callDivert = input.nextInt();
      //case for call setting option
        switch(callDivert)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Call Divert");
            
        }
    }
    

    case 8 ->
    { 
    System.out.print("""
                            Games

    Your games are available here you can enter 0 to go back
    to main menu


    """);
    int games = input.nextInt();
      //case for call setting option
        switch(games)
        {
        case 0 -> menu();
            
        }
    }

    case 9 -> 
    {
      System.out.print("Calculator");
    
     int calculator = input.nextInt();
      //case for call setting option
      
        switch(calculator)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Your calculator is here.");
            
        }
    }
    case 10 ->
    { 
      System.out.print("Reminders");
        int reminders = input.nextInt();
      //case for call setting option
        switch(reminders)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Your reminders are here. Always check");
            
        }
    } 

    case 11 -> {
    System.out.print("""
    ******************Clock Settings********************
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
    """);
    int clockSettingsOptions = input.nextInt();
      //case for call setting option
        switch(clockSettingsOptions)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Alarm clock");
           case 2 -> System.out.println("Clock settings");
             case 3 -> System.out.println("Date setting");
              case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countetimer");                           
                 case 6 -> System.out.println("Auto update of date and time");
            
        }
    }


   
    case 12 -> 
    {
    System.out.println("Profiles");
    int profiles = input.nextInt();
      //case for call setting option
        switch(profiles)
        {
        case 0 -> menu();
         case 1 -> System.out.println("Your profile is available right here");
            
        }
    }

    case 13 -> 
    { 
     System.out.println("SIM services");
       int simServices = input.nextInt();
      //case for customer service 
        switch(simServices)
        {
        case 0 -> menu();
         case 1 -> System.out.println("You can contact customer's service on 08134982384");
            
        }
    }

    default -> System.out.println("Invalid selection, Enter a valid number");
	}

	}
}


	
