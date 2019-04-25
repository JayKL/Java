class RemoveDuplicates{
	public void removeDuplicates(String message){
		int check;
		check=0;
		message=" " + message;
		message=message + " *";
		String finalmessage=" ";
		for (int i=0;i<message.length();i++){
			String currentcharacter=message.substring(i,i+1);
			if (i!=0){
				String previouscharacter=message.substring(i-1,i);
				if (previouscharacter.equals(" ") && !currentcharacter.equals(" ")){
					String currentword="";
					for (int i2=i; i2<message.length();i2++ ){
						if (message.substring(i2,i2+1).equals(" "))
						{
							break;
						}
						currentword+=message.substring(i2,i2+1);
					}
					check=0;
					for (int i3=0;i3<finalmessage.length();i3++){
						if (i3!=0){
							if (finalmessage.substring(i3-1,i3).equals(" ") && !finalmessage.substring(i3,i3+1).equals(" ")){
								String checkword="";
								for ( int i4=i3;i4<finalmessage.length();i4++){
									if (finalmessage.substring(i4,i4+1).equals(" "))
									{
										break;
									}
									checkword+=finalmessage.substring(i4,i4+1);
								}
								
								if (checkword.equals(currentword)){
									check=1;
									break;
								}
							}
							
						}
						
					}
					if (check==0){
						finalmessage=finalmessage + currentword;
					}
				}
				else if (currentcharacter.equals(" ") && check==0) {
					finalmessage=finalmessage + currentcharacter;
				}
				else if ((currentcharacter.equals(" ") && check!=0) && previouscharacter.equals(" ")){
					finalmessage=finalmessage + currentcharacter;
				}
			}
		}
		System.out.println("FINALMESSAGE:" + finalmessage.substring(1,finalmessage.length()-2) + "|");
	}
	
}