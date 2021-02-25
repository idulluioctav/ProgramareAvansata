package main.lab2.compulsory;

import java.util.Arrays;

public class Problem {
    /**
     * The problem class
     **/
    private Source[] sources;
    private Destination[] destinations;
    private int[] supply;
    private int[] demand;
    private int[][] cost;

    public Problem() {
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }

    public int[] getSupply() {
        return supply;
    }

    public void setSupply(int[] supply) {
        this.supply = supply;
    }

    public int[] getDemand() {
        return demand;
    }

    public void setDemand(int[] demand) {
        this.demand = demand;
    }

    public int[][] getCost() {
        return cost;
    }

    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    public String toString() {
        return "Problem{" + Arrays.toString(sources) + Arrays.toString(destinations) + Arrays.toString(supply) + Arrays.toString(demand) + (Arrays.deepToString(cost)) + "}";
    }
}
