class StringOrganiser2{
	public static void main(String xyz[]){
		StringOrganiser2 refvariable=new StringOrganiser2();		
		refvariable.wordReverser("hello hi");
	}
		
	public static boolean endwordchars(String ewcinputstring){
		switch(ewcinputstring){
			case " ":  return true;
			case "!": return true;
			case "?":  return true;
			case ",":  return true;
			case ".":  return true;
			case "'":  return true;
			case "\"":  return true;
			case ";":  return true;
		}
		return false;
	}
	
		public void wordReverser(String inputstring){
		System.out.println("String input=" + inputstring);
		inputstring=inputstring+" ";
		int startofword=0;
		int countfromword=0;
		boolean waswordlast=false;
		String reversedwords="";

		for (int i=0;i<inputstring.length();i++){
			String currentcharacter=inputstring.substring(i,i+1);
			// System.out.println("--------NEWCHAR---------");
			// System.out.println("current char: " + currentcharacter);
			if (!endwordchars(currentcharacter)){
				startofword=i-countfromword;
				// System.out.println("PART OF A WORD"); //continue
				// System.out.println("start of word: " + startofword);
				// System.out.println("count from word: " + countfromword);
				countfromword=countfromword+1;
				waswordlast=true;
			}else if (endwordchars(currentcharacter)){
												// System.out.println("nonword char");

				if (waswordlast){
				// System.out.println("word range: " + countfromword);
				for (int j=0;j<(countfromword);j++){
				reversedwords=reversedwords +  inputstring.substring(startofword+countfromword -1-j,startofword+countfromword-j);
				

				}
				reversedwords=reversedwords +currentcharacter;
				countfromword=0;
				startofword=0;
				} else {
					reversedwords=reversedwords +currentcharacter;
				}
				waswordlast=false;
				}
			}
		
	System.out.println("String with letters reversed=" + reversedwords);
	}
	
	
}