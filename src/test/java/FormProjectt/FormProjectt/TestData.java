package FormProjectt.FormProjectt;

import java.util.Random;

public class TestData {
String [] TextInput= {"noor","malak","lolo"};
String [] Email= {"noor@gmail.com","malak@gmail.com","lolo@gmail.com"};
String [] Date = {"12/30/2001","5/25/2005","5/3/2002"};
String [] Password= {"P@$$W0RD","malak@#%$","lolo&&NONO"};
String [] Number= {"9267584314","9267584315","9267584318"};
//String [] Gender = {"male","female"};
String FilePath = "C:\\Users\\user\\Desktop\\NoorAlhuda Mohmmed Odat (CV).docx";

Random rand= new Random();
int RandomIndx =rand.nextInt(3);
//int RandomIndexForTheDate = rand.nextInt(Date.length); date indx is deff
//int RandomIndexGender = rand.nextInt(Gender.length);
int RandomGender2 = rand.nextInt(2);
int RandomIndexHoppy = rand.nextInt(2);


String RandomText =TextInput[RandomIndx];
String RandomEmail =Email [RandomIndx];
String RandomDate =Email [RandomIndx];
String RandomPassword =Password [RandomIndx]; 
String RandomNumber=Number [RandomIndx];
//String RandomGender = Gender[RandomIndexGender];

}
