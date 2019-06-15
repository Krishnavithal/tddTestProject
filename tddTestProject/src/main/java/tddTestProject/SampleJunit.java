package tddTestProject;

public class SampleJunit {
	public String sample(String s) {
		if(s.length()==0)
			return s;
		if(s.length()==1)
		{
			char firstLetter = s.charAt(0);
			if(firstLetter=='A')
				return "";
			else
				return s;
		}
		char firstLetter = s.charAt(0);
		char secondLetter = s.charAt(1);
		if(firstLetter=='A'&& secondLetter!='A')
			return s.substring(1);
		else if(firstLetter!='A'&& secondLetter=='A')
			return s.charAt(0)+s.substring(2);
		else if(firstLetter=='A'&& secondLetter=='A')
			return s.substring(2);
		return s;
	}
}
