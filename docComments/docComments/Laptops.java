// Alexander Murdock

package docComments;

import java.util.Arrays;

public class Laptops {
	/**
	 * Needs to have GPU, CPU, Battery Life, unique id and static count as attributes.
	 */
	private String gpu;
	private String cpu;
	private String batterylife;
	private int id;
	
		public Laptops(String gpu, String cpu, String batterylife) {
				this.gpu =  gpu;
				this.cpu = cpu;
				this.batterylife = batterylife;
				this.id = 1000003;
		}

		/**
		 * Returns the GPU of the Laptop.
		 * @return the GPU
		 */
		public String getGpu() {
			return gpu;
		}

		/**
		 * Returns the CPU of the Laptop.
		 * @return the CPU
		 */
		public String getCpu() {
			return cpu;
		}

		/**
		 * Returns the batterylife of the Laptop.
		 * @return the batterylife
		 */
		public String getBatteryLife() {
			return batterylife;
		}
		
		/**
		 * Returns the user inputed id of the Laptop.
		 * @return the user inputed id
		 */
		public int getId() {
			return id;
		}
		
		
		/**
		 * Returns the new id we created.
		 * @return the new id
		 */
		public int creatId() {
			id = id + 1;
			return id;
		}
		
		
		/**
		 * Array of laptops
		 */
    	String[][] laptops = {
				{"1000001", "RTX 3080", "Intel i7", "24h"},
				{"1000002", "RTX 4090", "Intel i9", "16h"},
				{"1000003", "GTX 1660", "Ryzen 5", "34h"}
		};
		
		
		/**
		 * Prints all of the laptops in our array
		 */
		public void printAllLaptops() {
			 for (int i = 0; i < laptops.length; ++i) {
				 System.out.println("Laptop " + i +": " + "ID:" + laptops[i][0] + " " + laptops[i][1] + " " + laptops[i][2] + " " + laptops[i][3]);
			 }
		}
		
		/**
		 * Adds user created laptop to laptops array
		 */
	    public String[][] addLaptop(String gpu, String cpu, String batterylife) {
	    	if (gpu != null) {
	    	String arr2[][] = {{String.valueOf(creatId()), gpu, cpu, batterylife}};
	        
	        // create new array 
	        String newArray[][] = new String[laptops.length + arr2.length][];
	        
	        // Copy laptops array to new array from 0 to laptops.length
	        System.arraycopy(laptops, 0, newArray, 0, laptops.length);
	        
	        // copy second array to new array
	        System.arraycopy(arr2, 0, newArray, laptops.length, arr2.length);
	        
	        // set old array equal to new array
	        laptops = newArray;
	        return newArray;
	    	} else {
	    		System.out.println("Error adding laptop to list.");
	    		return laptops;
	    	}
	    	
	    }
	    
	    /**
	     * Deletes an item out of the laptops array based off of the provided id from the user
	     * 
	     * @param id param that finds the laptop to delete
	     * @return updated laptops array
	     */
	    public String[][] removeLaptop(String id) {
	    	if (id != null) {
	    			for ( int p = 0; p < laptops.length; ++p ) {
		  		    for ( int j = 0; j < laptops.length; ++j ) {
			  		        if ( laptops[p][j].equals(id) ) {
			  		          // Get the specific index
			  		          int index = p;
			  		   
			  		          // If the array is empty
			  		          // or the index is not in array range
			  		          // return the original array
			  		          if (laptops == null || index < 0
			  		              || index >= laptops.length) {
			  		   
			  		              return laptops;
			  		          }
			  		   
			  		          // Create another array of size one less
			  		          String[][] anotherArray = new String[laptops.length - 1][];
			  		   
			  		          // Copy the elements except the index
			  		          // from original array to the other array
			  		          for (int i = 0, k = 0; i < laptops.length; i++) {
			  		   
			  		              // if the index is
			  		              // the removal element index
			  		              if (i == index) {
			  		                  continue;
			  		              }
			  		   
			  		              // if the index is not
			  		              // the removal element index
			  		              anotherArray[k++] = laptops[i];
			  		          }
			  		   
			  		          // send user confirmation text
			  		          System.out.println(Arrays.toString(laptops[p]) + " has bee deleted");
			  		          
			  		          // return the resultant array
			  		          laptops = anotherArray;

			  		          return anotherArray;
			  		        }
		  		        
		  		    }
		  		}
		  	 
	    			System.out.println("can't find Id");
		  	 } else {
		  		 System.out.println("Must enter a vaild Id:");
		  	 }
	    	
			return laptops;

	    }
	    
	    /**
	     * Find laptop by user provided Id
	     */
	    public void findLaptop(String id) { 
	    	 	    
	  	 for ( int i = 0; i < laptops.length; ++i ) {
	  		    for ( int j = 0; j < laptops.length; ++j ) {
	  		        if ( laptops[i][j].equals(id) ) {
	  		        	System.out.println(Arrays.toString(laptops[i]));
	  		        }
	  		        
	  		    }
	  		}
	    }
	    
	    /**
	     * Counts number of laptops in laptops array
	     */
	    public void numberOfLaptops() {
	         System.out.println("There are " + laptops.length + " laptops in list");
	    }
	    
}
