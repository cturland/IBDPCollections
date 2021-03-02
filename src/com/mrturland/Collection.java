package com.mrturland;

/**
 * <h1>IBDP Pseudocode Collection Class</h1>
 * The Collection class implements the IBDP Collection class
 * used in Paper 1 pseudocode questions.
 *
 * @author  Carl Turland (mrturland@gmail.com)
 * @version 1.0
 * @since   2021 2nd March
 */

import java.util.ArrayList;

public class Collection<Type> {

    private ArrayList<Type> listofItems;
    private int currInd = -1;

    /**
     * This is the constructor.
     */
    public Collection(){
        listofItems = new ArrayList<>();
    }

    /**
     * Adds an element that contains the argument, whether it is a value, String, object, etc.
     * @param item This is the item to add to the collection
     * @return Nothing.
     */
    public void addItem(Type item){
        listofItems.add(item);
    }

    /**
     * getNext() will return the first item in the collection when it is first called.
     * Note: getNext() does not remove the item from the collection.
     * @return Type dependent on type used to create the collection
     */
    public Type getNext(){
        currInd++;
        return listofItems.get(currInd);
    }

    /**
     * Restarts the iteration through the collection.
     * @return Nothing.
     */
    public void resetNext(){
        currInd = -1;
    }

    /**
     * Returns TRUE if there are one or more elements in the collection that have not been accessed by the
     * present iteration: The next use of getNext() will return a valid element.
     * @return boolean.
     */
    public boolean hasNext(){
        if (currInd+1 < listofItems.size() && listofItems.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns TRUE if the collection does not contain any elements.
     * @return boolean.
     */
    public boolean isEmpty(){
        return listofItems.isEmpty();
    }
}

