import java.util.Scanner;

public class Nokia{
	public static void main(String [] args){

	menu();
}
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

	Please select an option from 1 - 13 above.
	""");

	int mainMenu = input.nextInt();

	switch(mainMenu){

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
	            
	Please select options from 1 - 10.
	""");
    
    case 2 -> {

    System.out.print( """
    **********************Messages************************
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
	            
	Please select options from 1 - 10.
	""");
    int options = input.nextInt();
    switch(options){
    case 1 -> System.out.print( """
    **********************Search************************
    You can start your search from here. 
    """);
    case 2 -> System.out.print( """
    ********************Service Nos.*********************
    You can access service no from here.
    """);
    case 3 -> System.out.print( """
    ********************Add name********************
    You can add names from here.  
    """);
    case 4 -> System.out.print( """
    **********************Erase************************
    You can erase stuffs here.
    """);
    case 5 -> System.out.print( """
    **********************Edit************************
    You can edit your notes here.  
    """);
    case 6 -> System.out.print( """
    **********************Assign tone************************
    Assign a tone of your choice from here
    1. Twinkle litte star
    2. Yankee Doodle
    """);
    case 7 -> System.out.print( """
    **********************Send b'card************************
    You can send birthday cards to your loved ones here. 
    """);
    case 8 -> System.out.print( """
    **********************Options************************
    
                1. Type of view
                2. Memory status   
    """);
    case 9 -> System.out.print( """
    **********************Speed dials************************
    Your speed dial list is here.
    1. 09383367637
    2. 09134982384 
    """);
    case 10 -> System.out.print( """
    **********************Voice tag************************
    You can tag voice from here. 
    """);
    default -> System.out.println("Please select the right option");
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
    case 7 -> {System.out.print("""
    *******************Message Settings*******************
                1. Set 1
                2. Common 3
    
    Select option 1 or 2
    """);
    int setCommon = input.nextInt();
    switch(setCommon){
    case 1 -> System.out.print("""
   **********************Set 1****************************
                1. Message centre number
                2. Messages sent as
                3. Message validity
    """);
    case 2 -> 
    System.out.print("""
    ***********************Common3************************
                1. Delivery reports
                2. Reply via same centre
                3. Character support
    """);
    }
    

    }
    
    }

    }

    case 3 -> 
    System.out.print("""
    
    ************************Chat**************************
    """);

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

    case 5 -> 
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

    case 6 -> {
    System.out.print("""
    **********************Settings************************
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
    
    Enter 1 for call settings 
    """);
    int callSettings = input.nextInt();
    
    switch(callSettings){
    case 1 -> System.out.print("""
    *********************Call Settings********************
                1. Automatic redial
                2. Speed dialling
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer 
    """);
    case 2 -> System.out.print("""
    *********************Phone settings*******************
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights2
                6. Confirm SIM service actions
    """);
    case 3 -> System.out.print("""
    *********************Security settings****************
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
    """);
    case 4 -> System.out.print("""
    *******************Restore factory settings*********** 
    """);
    }
    }

    case 7 -> System.out.print("Call divert");

    case 8 -> System.out.print("Games");

    case 9 -> System.out.print("Calculator");
    case 10 -> System.out.print("Reminders");

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
    
    
    }

    case 12 -> System.out.print("Profiles");

    case 13 -> System.out.print("SIM services");

    default -> System.out.println("Invalid selection, Enter a valid number");
	}

	}
}


	
