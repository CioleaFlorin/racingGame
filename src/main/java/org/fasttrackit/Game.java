package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks=new Track[3];
    private List <Vehicle> competitors=new ArrayList<>();



    public void start() throws Exception {
        initializeTrack();
        displayTracks();

        Track selectedTrack= getSelectedTrackFromUser();

        initializeCompetitors();

        boolean winnerNotKnown=true;
        int competitorWithoutFuel=0;

        while ( winnerNotKnown && competitorWithoutFuel < competitors.size()){

            System.out.println("New round...\n");

        //for-each or enhance for loop
        for(Vehicle vehicle:competitors){
            System.out.println("It's "+ vehicle.getName()+" turn.");
            double speed= getAccelerationSpeedFromUser();
            vehicle.accelerate(speed,1);

        if(selectedTrack.getLenght()<=vehicle.getTravelDistance()){
            winnerNotKnown=false;
            System.out.println("The winner is " + vehicle.getName());
            break;
        }

        if ((vehicle.getFuelLevel()<=0))
            competitorWithoutFuel++;
    }}}

    private double getAccelerationSpeedFromUser(){
        System.out.println("Please enter acceleration speed.");
        Scanner scanner=new Scanner(System.in);
        try {
            return scanner.nextDouble();

        }    catch (InputMismatchException e){
            System.out.println("You entered invalid number");
            return getAccelerationSpeedFromUser();
        }

    }


    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track.");
        Scanner scanner=new Scanner(System.in);

        try {
            int userChoice = scanner.nextInt();
            return tracks[userChoice-1];
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered an invalid number!");
            //recursion - a method calling itself
            return getSelectedTrackFromUser();

        }

    }


    private void initializeCompetitors() throws Exception {

        int competitorCount=getCompetitorCountFromUser();

        System.out.println("Today's competitors are:");
        for(int i=0; i<competitorCount; i++){
            Vehicle competitor=new Vehicle();
            competitor.setName("Competitor "+ i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6,12));
            competitor.setFuelLevel(80);
            System.out.println(competitor);

            competitors.add(competitor);


        }

    }

    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter number of players.");
        Scanner scanner=new Scanner(System.in);
        try {
            return scanner.nextInt();
        }
        catch (Throwable e){
            throw new Exception("You entered an invalid number");

        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }


    private void initializeTrack(){
        Track track1=new Track();
        track1.setName("Monte Carlo");
        track1.setLenght(300);

        tracks[0] = track1;

        Track track2=new Track();
        track2.setName("Monza");
        track2.setLenght(400);

        tracks[1] = track2;

    }

    private void displayTracks(){
        System.out.println("Available tracks: ");

        for(int i=0; i<tracks.length; i++){
            if(tracks[i]!=null)
                System.out.println(tracks [i]);

        }
    }




}
