package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        //Your function
        // must return an integer denoting the minimum number of button presses needed to switch from song sk to song q.
        // This is printed to stdout by the locked stub code in your editor.


        //Initialize length of playlist = n
        int n = playList.length;
        //Initialize song Q index
        int songQIndex = -1;

        //For loop to iterate through song playlist (array list)
        for (int i = 0; i < n; i++) {
            if (playList[i].equals(selection)) {
                break;
            }
        }
        int buttonSkipsUp = (songQIndex - startIndex + n) % n;
        int buttonSkipsDown = (startIndex - songQIndex + n) % n;

        return Math.min(buttonSkipsUp, buttonSkipsDown);
    }
}
