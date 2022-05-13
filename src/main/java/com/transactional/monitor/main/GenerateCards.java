package com.transactional.monitor.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.transactional.monitor.model.Transaction;


public class GenerateCards {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		/*
		try {
			
			String ruta= "transactions.txt";
			
			File file = new File(ruta);
			
			
			//Si el archivo no existe es creado
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 1; i <= 10000000; i++) {
				
				int n_1 = (int) (Math.random() * (1000 - 9999)) + 9999;
				int n_2 = (int) (Math.random() * (1000 - 9999)) + 9999;
				int n_3 = (int) (Math.random() * (1000 - 9999)) + 9999;
				int n_4 = (int) (Math.random() * (1000 - 9999)) + 9999;
				
				String card_number = String.valueOf(n_1) + String.valueOf(n_2) + String.valueOf(n_3) + String.valueOf(n_4);
				int amount = (int) (Math.random() * (1 - 10000)) + 10000;
				int val = (int) (Math.random() * (0 - 2)) + 2;
				String status = (val == 2)?"Rechazada":"Aprobada";
				int val2 = (int) (Math.random() * (0 - 2)) + 2;
				String type = (val == 2)?"Retiro":"Deposito";
				bw.write(i+","+card_number+","+amount+","+status+","+type);
				bw.write(" ");
			}
			
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		*/
		
		 // File path is passed as parameter
        File file = new File(
            "transactions.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        
        List<Transaction> transactionList = new ArrayList<>();
        
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
        	
        	String[] row = st.split(" ");
        	for (String string : row) {
        		String[] rp = string.split(",");
        		Transaction transaction = new Transaction();
            	transaction.setId(Integer.valueOf(rp[0]));
            	transaction.setCard_number(rp[1]);
            	transaction.setAmount(Integer.valueOf(rp[2]));
            	transaction.setStatus(rp[3]);
            	transaction.setType(rp[4]);
            	
            	transactionList.add(transaction);
			}
        	
        	
        	
        }
 
        int count=0;
        for (int i = 0; i < transactionList.size(); i++) {			
        	  Transaction transaction = transactionList.get(i);
        	  if(transaction.getStatus().equals("Rechazada") && transaction.getType().equals("Retiro")) {
        		int myAmount=transaction.getAmount();
        		  if(transaction.getId() % 2 == 0) {
            		  for (int j = 0; j < 3; j++) {
						System.out.println("val"+j);  
					}
        		  }
        	  }
		}
          
          System.out.println("Total: **************");
          System.out.println(count);
       
		
	}

}
