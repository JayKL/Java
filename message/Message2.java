class Message2{
		public void wordCount(String x){
			System.out.println("-----------------WORDCOUNT METHOD CALLED-----------------");
			System.out.println("Checking word count of string={" + x + "}");
			int spacecount=0;
			// System.out.println("-----BEGIN WORDCOUNT-----  string length : " + x.length());
			if (" ".equals(x.substring(0,1))){
					// System.out.println("INITIAL SPACE DETECED, IGNORING FIRST SPACE IN COUNT");
					spacecount=spacecount -1;
			}
			for (int i=0;i<x.length();i++){

				if (" ".equals(x.substring(i,i+1))){
					spacecount=spacecount+1;
					// System.out.println("character: " + x.substring(i,i+1) );
					// System.out.println("--SPACE DETECTED--");
					if (i+2<x.length() && " ".equals(x.substring(i + 1,i+2))){
						// System.out.println("SPACE FOLLOWED BY SAPCE DETECTED");
						spacecount=spacecount-1;
					}
				} else{
					// System.out.println("character: " + x.substring(i,i+1) + " " );
				}
			}
			// System.out.println(" END CHAR IS:" + x.substring(x.length()-1,x.length()) );
			if (" ".equals(x.substring(x.length()-1,x.length()))){
				// System.out.println("END SPACE DETECTED, TAKING ONE SPACE FROM TOTAL VALUE");
				spacecount=spacecount-1;
				if (" ".equals(x.substring(x.length()-2,x.length()-1))){
					// System.out.println("SECOND END SPACE DETECTED, TAKING ONE SPACE FROM TOTAL VALUE");
					spacecount=spacecount-1;
				}
			}
			System.out.println( "\n" + "Amount of non duplicate spaces: " + spacecount + "  Amount of words: " + (spacecount+1));
			// System.out.println("METHOD DOES NOT ACCOUNT FOR WORD CASES WHICH ARE SEPARATED BY A HYPHEN, ONLY WORDS SPACED BY SINGLE SPACES.");
		}
}