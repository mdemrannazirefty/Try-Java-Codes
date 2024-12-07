public class Checkvowel
{
	public static void main (String[] arga) 
	{
	char x='c';
	switch (x)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		System.out.println( + x + "is Vowel");
		break;
			
		default:
			System.out.println( + x + "is Consonant");
		}
	}
}