package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    //Method starts here
    public Integer selection(Integer startIndex, String selection){
        //Your function
        // must return an integer denoting the minimum number of button presses needed to switch from song sk to song q.
        // This is printed to stdout by the locked stub code in your editor.


        //Initialize length of playlist = n
        int n = playList.length;
        //Initialize song Q index at -1 bc when we get to index of 0, the playlist starts
        int songQIndex = -1;

        //For loop to iterate through song playlist (array list)
        for (int i = 0; i < n; i++) {
            if (playList[i].equals(selection)) {
                break;
            }
        }
        //Number of button presses needed to move from start index to songQIndex in forward direction
        // % n handles the circular nature of playlists
        int buttonSkipsUp = (songQIndex - startIndex + n) % n;

        //Number of button presses needed to move from start index to songQIndex in backward direction
        int buttonSkipsDown = (startIndex - songQIndex + n) % n;

        //Return minimum number of getting to songQIndex (its either buttonskipsup or button skipsdown)
        return Math.min(buttonSkipsUp, buttonSkipsDown);
    }
}
