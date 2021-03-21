package SeleniumClass3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WikiDropDowns {

    public static void main(String[] args) {

//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
//		//https://en.wikipedia.org/wiki/Wiki
//		
//		driver.get("https://www.wikipedia.org");
//		
//		WebElement DropDown=driver.findElement(By.id("searchLanguage"));
//		//drop down element
//		Select LanguageOptions=new Select(DropDown);
//		//selecting the value from the drop down
//		
//		LanguageOptions.selectByVisibleText("Italiano");
//		LanguageOptions.selectByValue("es");
//		LanguageOptions.selectByIndex(10);
//		//how many options in the dropdown //interview
//		LanguageOptions.getAllSelectedOptions();
//		
//		//interview
//		WebElement Options= driver.findElement(By.tagName("option"));
//		System.out.println(Options.getAttribute("value"));
//		System.out.println(driver.findElements(By.tagName("options")));
//		//actual way to do it, USING THE JAVA ARRAY LIST.--JAVA COLLACTION FRAMEWORK
//		

        ArrayList mylist = new ArrayList();
        //add list to the array
        mylist.add("name");
        mylist.add("Jay");
        mylist.add(12);
        mylist.add("birhanu");
        mylist.add(true);
        mylist.add(12);
        mylist.add(3434.77);
        mylist.set(0, "Jay");
        mylist.remove(0); //or
        mylist.remove("jay");
        //do remove, set, add,

        ///access each object by index
        System.out.println(mylist.get(4));

        System.out.println(mylist);
        System.out.println(".................................");
        //user the for loop to access each element in the array list
//		
//		for (int i=0;i<mylist.size();i++) {
//			System.out.println("Item number"+ i+ "--" +mylist.get(i));
//		}
//		
//		System.out.println(".................................");
//		//use for each loop to access each element in the arry
//		for (Object myItem: mylist) {
//			System.out.println(myItem);
//		}

        System.out.println(".................................");
        //Using an iterator interface of the ArrayList

        System.out.println("****** Iterator *******");


        Iterator Itr = mylist.iterator();


        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }

        //Generics --specyfying a generic datatype using <> that will bind the list in the array datatype
        ArrayList<Integer> myintlist = new ArrayList<Integer>();
        //creat the same with the polymorpic reference

        List<Integer> myiintlist = new ArrayList<Integer>();


        myintlist.add(90);

//		driver.close();

    }

}
