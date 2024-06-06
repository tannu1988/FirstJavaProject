package stringDemo;

public class string1 {

	public static void main(String[] args) {
		String name = "taranpreetkaur";
		char ch;
		String name1 = "";
		// System.out.println(name.charAt(5));

		for (int i = 0; i < name.length(); i++) {

			ch = name.charAt(i);
//			System.out.println(ch);
			name1 = ch + name1;
		
			
		}
		System.out.println(name1);

	}

}
