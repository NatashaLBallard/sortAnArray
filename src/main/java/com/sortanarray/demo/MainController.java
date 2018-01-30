package com.sortanarray.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MainController {

    @RequestMapping("/")
    public String sortanarray ()
    {
        int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

        // Display the original (unsorted values)

        for ( int i=0; i<arr.length; i++ ) {
            System.out.print( arr[i] + " " );
            System.out.print("before: " + Arrays.toString(arr) );
       }


        // Swap the values around to put them ascending order.
		/*
		for ( ; ; )
		{
			for ( ; ; )
			{
				if ( )
				{
					// swap the values in two slots
				}
			}
		}
		*/

        //Display the values again, now (hopefully) sorted.
       // System.out.print("after : ");
      //  for ( int i=0; i<arr.length; i++ ) {
       //     System.out.print( arr[i] + " " );
       // System.out.println();}



        Arrays.sort(arr);

        System.out.printf("Modified arr[] : ");
                Arrays.toString(arr);

        return  Arrays.toString(arr);
    }
}

