Task 1 (30 marks)
Create a NetBeans project for this task, named Task1.
You are required to write a Java 8 program that opens and reads a data file that is located relative to the
NetBeans project root folder. The data file is called footballers.txt. The data file must not be altered and
should be considered as a read-only data file.
The data file is delimited in a consistent format and contains entries relating to football player of the year
awards from the 1994/95 season to the 2022/23 season of the English premier league. Each entry in the file
contains a series of data fields representing the following information: the season that the football player
won the award, the name of the football player, the team position of the football player (i.e., forward,
defender, goalkeeper etc.), the nationality of the football player, and the club side that the football player
played for.
You are required to implement a Java class to represent the football player of the year information with
respect to this data set. The program should parse the data file once and create and store a collection of
objects that represent the domain entity on program start-up. Once the collection is created, the program
should only access the data in that collection (and not make further access to the external data file). Figure 1
provides a partial UML class representation of a FootballPlayer class that you must implement to represent
the data. It is left to you to determine what methods the class should contain, as well as how the respective
objects should be initialised. The FootballPlayer class should implement an appropriate toString() method to
format console output appropriately when invoked as indicated below.
Figure 1: Partial UML class model for football player information.
Once the data has been loaded into the program, the User should be presented with a console-based menu
to interact with the data set. This menu should loop until the User enters a character to exit the menu (e.g.,
zero as illustrated below). In addition to an exit option, the menu should offer three other options: list, select
and sort.
On starting the program, the following menu should be displayed to the console:
-----------------------
Player of the year menu
-----------------------
List .................1
Select ...............2
Sort..................3
Exit..................0
-----------------------
Enter choice:>
The User can simply exit the program by entering zero. The three other menu options allow the User to 
inspect the information in the data set (note again that this program is entirely read-only and there is no
requirement to add, update or delete any part of the data set). The necessary interaction of the program
with respect to these options is illustrated in Appendix A.
Note that console output should be neatly formatted, and some consideration will be given to formatting
when the program is assessed. In particular, when the option to view the details for a given season is
selected (i.e., the ‘select’ menu option), it must result in the invocation of the relevant toString() method.
You are required to utilise a StringBuilder object when implementing the toString() methods for the domain
class illustrated in Figure 1.
The assessment rubric provided in the module handbook for the first sit will be applied.

Appendix A: Console interaction examples for Task 1
Option 1: list players of the year
On selecting option 1, the User should be presented with a neatly formatted table of the following
information: the season, the name of the player of the year for that season, and the English league club that
they played for. The required output is illustrated below. Note that all data displayed to the console must be
dynamically derived from the collection of FootballPlayer objects that have been loaded on start-up. Simply
‘hard coding’ the output illustrated below with fixed strings will be awarded no marks.
-----------------------
Player of the year menu
-----------------------
List .................1
Select ...............2
Sort..................3
Exit..................0
-----------------------
Enter choice:> 1
---------------------------------------------------------------------
| Season | Player | Club |
---------------------------------------------------------------------
| 1994–95 | Alan Shearer | Blackburn Rovers |
| 1995–96 | Peter Schmeichel | Manchester United |
| 1996–97 | Juninho | Middlesbrough |
| 1997–98 | Michael Owen | Liverpool |
| 1998–99 | Dwight Yorke | Manchester United |
| 1999–00 | Kevin Phillips | Sunderland |
| 2000–01 | Patrick Vieira | Arsenal |
| 2001–02 | Freddie Ljungberg | Arsenal |
| 2002–03 | Ruud van Nistelrooy | Manchester United |
| 2003–04 | Thierry Henry | Arsenal |
| 2004–05 | Frank Lampard | Chelsea |
| 2005–06 | Thierry Henry | Arsenal |
| 2006–07 | Cristiano Ronaldo | Manchester United |
| 2007–08 | Cristiano Ronaldo | Manchester United |
| 2008–09 | Nemanja Vidić | Manchester United |
| 2009–10 | Wayne Rooney | Manchester United |
| 2010–11 | Nemanja Vidić | Manchester United |
| 2011–12 | Vincent Kompany | Manchester City |
| 2012–13 | Gareth Bale | Tottenham Hotspur |
| 2013–14 | Luis Suárez | Liverpool |
| 2014–15 | Eden Hazard | Chelsea |
| 2015–16 | Jamie Vardy | Leicester City |
| 2016–17 | N'Golo Kanté | Chelsea |
| 2017–18 | Mohamed Salah | Liverpool |
| 2018–19 | Virgil van Dijk | Liverpool |
| 2019–20 | Kevin De Bruyne | Manchester City |
| 2020–21 | Rúben Dias | Manchester City |
| 2021–22 | Kevin De Bruyne | Manchester City |
| 2022–23 | Erling Haaland | Manchester City |
---------------------------------------------------------------------

Option 2: select year
On selecting option 2, the User should be prompted to enter the year of the award. For example, if the User
wishes to view the details of the player of the year for the 1997/98 season, then the User must enter 1998. If
an incorrect year is entered, an appropriate message should be displayed so the User can try again. On
entering a valid year, the console should display a neatly formatted representation of information pertaining
to the winning player for that season as illustrated below. This should include the name of the football
player, their position, their nationality, and the name of the English club side that they played for. The
console output should be achieved by invocation of the relevant toString() method.
-----------------------
Player of the year menu
-----------------------
List .................1
Select ...............2
Sort..................3
Exit..................0
-----------------------
Enter choice:> 2
Enter year of award > 1998
Player of the year for the 1997–98 season:
-----------------------------------------------
| Player | Michael Owen |
-----------------------------------------------
| Position | Forward |
-----------------------------------------------
| Nationality | England |
-----------------------------------------------
| Club | Liverpool |
-----------------------------------------------
-----------------------
Player of the year menu
-----------------------
List .................1
Select ...............2
Sort..................3
Exit..................0
-----------------------
Enter choice:>
Option 3: sort
On selecting option 3 from the main menu, the User should be presented with a sub-menu that allows the
User to inspect the data set in respect of three sorting options:
-----------------------
Player of the year menu
-----------------------
List .................1
Select ...............2
Sort..................3
Exit..................0
-----------------------
Enter choice:> 3
-------------------------
Sort number of awards by:
-------------------------
Position ...............1
Nationality ............2
Club....................3
Exit....................0
-------------------------
Enter choice:>
On selecting the first option, the data is sorted (and displayed to the console) by the player position, with the
highest number of winners who played in that position listed first to the lowest. This should be ordered by
the total number of awards for players in that position (which can be different to the number of players
because the same player may have won more than once). The data sorting must be performed dynamically
from the preloaded collection of objects. Simply ‘hard coding’ the output illustrated below with fixed strings
will be awarded no marks.
-------------------------
Sort number of awards by:
-------------------------
Position ...............1
Nationality ............2
Club....................3
Exit....................0
-------------------------
Enter choice:> 1
----------------------------------------
| Position | Players | Total |
----------------------------------------
| Forward | 12 | 14 |
----------------------------------------
| Midfielder | 8 | 9 |
----------------------------------------
| Defender | 4 | 5 |
----------------------------------------
| Goalkeeper | 1 | 1 |
----------------------------------------
Similarly, selecting the second option should sort and display the data by nationality, as illustrated below.
Again, this should be awarded by highest (total) first. And again, simply ‘hard coding’ the output illustrated
below with fixed strings will be awarded no marks.
-------------------------
Sort number of awards by:
-------------------------
Position ...............1
Nationality ............2
Club....................3
Exit....................0
-------------------------
Enter choice:> 2
--------------------------------------------------
| Country | Players | Total |
--------------------------------------------------
| England | 6 | 6 |
--------------------------------------------------
| Belgium | 3 | 4 |
--------------------------------------------------
| France | 3 | 4 |
--------------------------------------------------
| Portugal | 2 | 3 |
--------------------------------------------------
| Netherlands | 2 | 2 |
--------------------------------------------------
| Serbia | 1 | 2 |
--------------------------------------------------
| Uruguay | 1 | 1 |
--------------------------------------------------
| Wales | 1 | 1 |
--------------------------------------------------
| Egypt | 1 | 1 |
--------------------------------------------------
| Sweden | 1 | 1 |
--------------------------------------------------
| Norway | 1 | 1 |
--------------------------------------------------
| Brazil | 1 | 1 |
--------------------------------------------------
| Denmark | 1 | 1 |
--------------------------------------------------
| Trinidad and Tobago | 1 | 1 |
--------------------------------------------------
And similarly, the third sort option should sort and display the data by club, as illustrated below.
-------------------------
Sort number of awards by:
-------------------------
Position ...............1
Nationality ............2
Club....................3
Exit....................0
-------------------------
Enter choice:> 3
--------------------------------------------------
| Club | Players | Total |
--------------------------------------------------
| Manchester United | 6 | 8 |
--------------------------------------------------
| Manchester City | 4 | 5 |
--------------------------------------------------
| Liverpool | 4 | 4 |
--------------------------------------------------
| Arsenal | 3 | 4 |
--------------------------------------------------
| Chelsea | 3 | 3 |
--------------------------------------------------
| Tottenham Hotspur | 1 | 1 |
--------------------------------------------------
| Leicester City | 1 | 1 |
--------------------------------------------------
| Middlesbrough | 1 | 1 |
--------------------------------------------------
| Sunderland | 1 | 1 |
--------------------------------------------------
| Blackburn Rovers | 1 | 1 |
--------------------------------------------------
