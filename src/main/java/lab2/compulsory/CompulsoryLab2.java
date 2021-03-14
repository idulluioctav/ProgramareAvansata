package lab2.compulsory;


public class CompulsoryLab2 {
    /**
     * In the main class, we have the initialization of the data
     **/
    public static void main(String[] args) {
        Problem problem = new Problem();

        Source s1 = new Source();
        s1.setName("S1");
        s1.setType(Source.SourceType.FACTORY);
        Source s2 = new Source("S2", Source.SourceType.WAREHOUSE);
        Source s3 = new Source("S3", Source.SourceType.WAREHOUSE);

        Destination d1 = new Destination("D1");
        Destination d2 = new Destination("D2");
        Destination d3 = new Destination("D3");

        Source[] sources = {s1, s2, s3};
        Destination[] destinations = {d1, d2, d3};

        problem.setSources(sources);
        problem.setDestinations(destinations);

        int[] demand = {20, 25, 25};
        int[] supply = {10, 35, 25};
        int[][] cost = {{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};

        problem.setDemand(demand);
        problem.setSupply(supply);
        problem.setCost(cost);

        System.out.println(problem.toString());
    }
}