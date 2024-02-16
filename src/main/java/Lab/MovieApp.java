package Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Baza dla xranenie dannix
        Movie[] movies = new Movie[0];


        do {
            System.out.println("Press 1 to input movies: ");
            System.out.println("Press 2 to display movies: ");
            System.out.println("Press 3 to input more movies: ");
            System.out.println("Press 4 to find statistics: ");
            System.out.println("Press 5 to search for a movie: ");
            System.out.println("Press 6 to update movie ratings: ");


            int input = sc.nextInt();
            switch (input) {
                case 1:
                    movies = addMovie(movies);
                    break;
                case 2:
                    displayMovies(movies);
                    break;
                case 3:
                    movies = addMovies(movies);
                    break;
                case 4:
                    averageRatings(movies);
                    minimumRating(movies);
                    maximumRating(movies);
                case 5:
                    findMovie(movies);
                    break;
                case 6:
                    updateRatings(movies);
            }

        } while (true);


    }

    // Add movie to array
    private static Movie[] addMovie(Movie[] movies) {
        Scanner sc = new Scanner(System.in);
        if (movies.length == 0) {
            movies = new Movie[3];
            for (int i = 0; i < movies.length; i++) {
                System.out.println("Enter movie name: ");
                String addName = sc.next();
                System.out.println("Enter movie rating: ");
                double addRating = sc.nextDouble();
                movies[i] = new Movie(addName, addRating);
            }
            return movies;
        } else {
            Movie[] newMovies = new Movie[movies.length + 3];
            for (int i = 0; i < movies.length; i++) {
                newMovies[i] = movies[i];
            }
            for (int i = movies.length; i < newMovies.length; i++) {
                System.out.println("Enter movie name: ");
                String addName = sc.next();
                System.out.println("Enter movie rating: ");
                double addRating = sc.nextDouble();
                newMovies[i] = new Movie(addName, addRating);

            }
            return newMovies;
        }

    }

    //    Display movied
    public static void displayMovies(Movie[] movies) {
        if (movies.length != 0) {
            for (int i = 0; i < movies.length; i++) {
                System.out.println(movies[i].getName() + " " + movies[i].getRating());
            }

        } else {
            System.out.println("There is no movie");
        }

    }


    //    add aditional movies
    public static Movie[] addMovies(Movie[] movies) {
        Scanner sc = new Scanner(System.in);

        if (movies.length != 0) {
            System.out.println("How many additional movies you want to add: ");
            int n = sc.nextInt();
            Movie[] newArr = new Movie[movies.length + n];
            for (int i = 0; i < movies.length; i++) {
                newArr[i] = movies[i];
            }
            for (int i = movies.length; i < newArr.length; i++) {
                System.out.println("Enter movie name: ");
                String movieName = sc.next();
                System.out.println("Enter movie rating: ");
                double movieRating = sc.nextDouble();
                newArr[i] = new Movie(movieName, movieRating);

            }
            return newArr;
        } else {
            System.out.println("There is no movie, first of all add movies");
            return new Movie[0];
        }

    }


    //    Find average
    public static void averageRatings(Movie[] movies) {
        double sum = 0;
        int count = 0;
        int empty = 0;
        if (movies.length != 0) {
            for (int i = 0; i < movies.length; i++) {
                sum += movies[i].getRating();
                count++;
            }
            double result = sum / count;
            System.out.println("Average is: " + result);

        } else {
            System.out.println("There is no movie");

        }
    }

    // Find minimum of ratings
    public static void minimumRating(Movie[] movies) {
        double min = movies[0].getRating();
        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getRating() < min) {
                min = movies[i].getRating();
            }
        }
        System.out.println("Minimum element is: " + min);
    }


    // Find maximum of rating
    public static void maximumRating(Movie[] movies) {
        double max = movies[0].getRating();
        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getRating() > max) {
                max = movies[i].getRating();
            }
        }
        System.out.println("Maximum element is: " + max);

    }

    //  Search a movie
    public static void findMovie(Movie[] movies) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name you want to search: ");
        String inputName = sc.next().toLowerCase();
        boolean found = false;

        for (int i = 0; i < movies.length; i++) {

            if (movies[i].getName().equals(inputName)) {
                found = true;
                System.out.println("Movie name and its rating: " + movies[i].getName() + " " + movies[i].getRating());
                break;
            }
        }
        if(!found){
            System.out.println("Movie is not found");
        }
    }


    public static void updateRatings(Movie[] movies) {
        Scanner sc = new Scanner(System.in);


        if (movies.length != 0) {

            for (int i = 0; i < movies.length; i++) {
                System.out.println("Update rating: ");
                movies[i].setRating(sc.nextDouble());
            }

        } else {
            System.out.println("Movie is not found");
        }

    }


}

