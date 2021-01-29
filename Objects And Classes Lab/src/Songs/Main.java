package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();

        int numSongs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numSongs; i++) {
            String[] tokens = scanner.nextLine().split("_");
            String type = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song(type, name, time);
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }

            }
        }
    }
}
