package epam.tddjunitdemo;

public class Removefirst2A {

	public String remove(String string) {
		for(int i=0;i<2;i++)
		{
			if(string[i]=="A")
			{
				string.deleteCharAt(0);
			}
		}
		return string;
	}

}
