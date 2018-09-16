package com.leslie.misc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    static Map<String, PathItem> configMap = new HashMap();//Holds all paths
    static List<String[]> queries = new ArrayList<>();
    static final String FOUR04 = "404";
    static final String X = "x";
    
    public static void main(String args[] ) throws Exception {
        
    	File text = new File("/Users/leslie/Downloads/test_cases_6p9r71pgrfn/input001.txt");
        
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);

        //Process input & query, return query
        PathItem root = processInput(scnr);
        
        //System.out.println(root);
        //System.out.println(configMap);
        
        processQueries(root);
        
    }
    
    
    private static void processQueries(PathItem root){
        
        
        for(String[] query : queries){        
            processQuery(root, query);  
        }
          
    }
    
    
    private static void processQuery(PathItem root, String[] query){
             
        PathItem node = root;      

        //int[] wild = new int[query.length];//Used to determine whether the wild path should be taken (1)
        
        for(int i = 0; i < query.length; i++){

        	String q = query[i];
        	
            if(root.getKey().equals(q)){//Only root query has string "/"
            	System.out.println(root.getMethodName());
                break;
            } 
            
            PathItem queryPath =  node.getPaths().get(q);
            PathItem wildPath = node.getPaths().get(X);
            
            if(queryPath != null){
                node = queryPath;
                if(wildPath != null){
                	//wild[i] = 1;
                }
            }
            
            else if(wildPath != null){
                node = wildPath;
            }
            else {
            	
            	
        		System.out.println(FOUR04);
        		return;     	
            }
            
        }
        
        System.out.println(node.getMethodName());
        
    }
    
    
    /**
        Reads config & Query
     */
    private static PathItem processInput(Scanner scanner){
   
        PathItem root = new PathItem("/", null); 
        configMap.put(root.getMethodName(), root);
        
        //Scanner scanner = new Scanner(System.in);
        
        //Process configuration
        while(scanner.hasNextLine() ){
            
        	
             // /user/friends userFriendsEndpoint
            // /user/lists userListsEndpoint
            // /user/X userEndpoint
                 
            String line = scanner.nextLine().toLowerCase();
            
            if(line.toString().startsWith("#")) break;
            	
            String[] tokens = line.split("\\s+");// /user/X/friends userFriendsEndpoint
            if(root.getKey().equals(tokens[0])){
                root.setMethodName(tokens[1]);
            }
            else{
                PathItem node = root;
                tokens[0] = tokens[0].replaceFirst("/", "");
                String[] segments = tokens[0].split("/");// /user/X/friends
                for(String seg : segments){
                    PathItem p = node.getPaths().get(seg);
                    if(p == null){
                        PathItem newPathItem = new PathItem(seg, null);
                        node.addPathSegment(newPathItem);
                        node = newPathItem;
                    }
                    else{
                        node = p;
                    }
                }
                
                node.setMethodName(tokens[1]);
              
     
            }
        }
        
        //Skip end of configuration line
        //if(scanner.hasNext()) scanner.nextLine();
        
        //Store queries
        while(scanner.hasNextLine()){
            
            String query = scanner.next().toLowerCase();
    
            if(root.getKey().equals(query)){
                String[] rootQuery = {"/"};
                queries.add(rootQuery);
            }
            else{
            	query = query.replaceFirst("/", "");
                queries.add(query.split("/"));
            }
            
        }
        
        return root;
        
    }
    
    
    private static void doSomething(){
        
        /*
            
            = No pattern, print 404
            = Static patterns preferred
            
            /user userRootEndpoint
            /user/friends userFriendsEndpoint
            /user/lists userListsEndpoint
            /user/X userEndpoint
            /user/X/friends userFriendsEndpoint
            /user/X/lists userListsEndpoint
            /user/X/lists/X userListIdEndpoint
            / rootEndpoint
            /X/friends userFriendsEndpoint
            /X/lists userListsEndpoint
            /settings settingsEndpoint
            
            # end of configuration, request paths to follow
            
            /user
            /user/friends
            /user/123
            /user/123/friends
            /user/123/friends/zzz
            /user/friends/friends
            /
            /abc/lists
            /settings
            /aaa/bbb

        
        */
        
    }
    
    
    
    /**
        Class to represent a path
     */
    static class PathItem{

        String key;
        String methodName;
        Map<String, PathItem> paths;

        public PathItem(String key, String methodName){
            this.key = key;
            this.methodName = methodName;
            paths = new HashMap<>();
        }

        /*
            Getters
         */
        
        public String getKey(){
            return key;
        }
        
        public String getMethodName(){
            return methodName;
        }

        public Map<String, PathItem> getPaths(){
            return paths;
        }

        public void addPathSegment(PathItem path){
            paths.put(path.getKey(), path);
        }

        /*
            Setters
         */ 
        
        public void setKey(String key){
            this.key = key;
        }
        
        public void setMethodName(String methodName){
            this.methodName = methodName;
        }
        /*
            Other
         */
       // @Override
       //public String toString(){
       //     return "Key: " + key + ", MethodName: " + methodName + ", Paths: " + paths;
       // }
        
    }//End class
    
    
    
}