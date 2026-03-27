package com.kpmg.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.kpmg.employee.Employee;

public class UrlFilterExample {

    /**
     * Filters a list of URLs based on a given predicate.
     *
     * @param urls The list of URLs to filter.
     * @param condition The predicate (boolean-valued function) to apply to each URL.
     * @return A new list containing only the URLs that satisfy the condition.
     */
    public static List<String> filterUrls(List<String> urls, Predicate<String> condition) 
    
    {
        return urls.stream()
                   .filter(condition) // Applies the predicate to the stream elements
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> websiteUrls = Arrays.asList(
            "https://www.google.com",
            "http://insecure.com",
            "https://analytics.google.com",
            "ftp://://example.com"
        );

        // Define a Predicate<String> to check if a URL starts with "https://"
        Predicate<String> isSecureUrl = url -> url.startsWith("https://");

        // Use the sample method with the predicate
        List<String> secureUrls = UrlFilterExample.filterUrls(websiteUrls, x->x.equals(x));

        System.out.println("Original URLs: " + websiteUrls);
        System.out.println("Secure URLs: " + secureUrls);
//
//        // Example using the negate() method to find insecure URLs
//        List<String> insecureUrls = filterUrls(websiteUrls, isSecureUrl.negate());
//        System.out.println("Insecure URLs: " + insecureUrls);
    }
}

