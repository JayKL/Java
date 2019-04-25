class StringOrganiser{
	public static void main(String xyz[]){
		StringOrganiser refvariable=new StringOrganiser();
		refvariable.stringOrganiser("from you there hi a yourself");
	}
	
	public void stringOrganiser(String inputstring){
		System.out.println("String input=" + inputstring);
		inputstring=inputstring+" ";
		int startofword=0;
		int countfromword=0;
		String wordsinasce="";
		for (int j=1;j<inputstring.length();j++){
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
			}else if (endwordchars(currentcharacter)){
				// System.out.println("word range: " + countfromword + "    j: " + j);
				if (j==countfromword && countfromword!=0){
					wordsinasce=wordsinasce + " " +  inputstring.substring(startofword,startofword+countfromword);
				}
				countfromword=0;
				startofword=0;
				// System.out.println("nonword char");
				}
			}
		}
	System.out.println("String in ascending order=" + wordsinasce.substring(1,wordsinasce.length()));
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
	
}