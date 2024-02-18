package streams;

import java.util.List;

public class StreamPrac {

	public static void main(String[] args) {
		
		List<String> list = List.of("Apple","Bannana","Carrot","Dates","elderberry","flower");
		//printLength5StringsTradiationalForLoop(list);
	//	printLength5StringsEnhancedLoop(list);
		
		printLength5StringsWithStreamAPI(list);
	}
	
	
	public static void printLength5StringsTradiationalForLoop(List<String> list)
	{
		System.out.println(" Traditona loop");
		for(int i=0;i<list.size();i++)
		{
			String s = list.get(i);
			if(s.length()==5)
			{
				System.out.println(s);
			}
		}
		
	}
	
	public static void printLength5StringsEnhancedLoop(List<String> list)
	{
		System.out.println(" Enhanced  loop");
		for(String s: list)
		{
			if(s.length()==5)
			{
				System.out.println(s);
			}
		}
		
	}
	
	public static void printLength5StringsWithStreamAPI(List<String> list)
	{
		System.out.println(" Stream API");
		
		list.stream().filter(s -> s.length()==5).forEach(x -> System.out.println(x));
		
		// s -> s.length()==5 -> lambda expression      m                            cx     v   [  
		
	}
}



