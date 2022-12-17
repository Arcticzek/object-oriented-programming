public class Species {
    private final String genusName;
    private final String speciesName;
    private final int numChromosomes2n;
    private final int basicNumChromosomesx;
    private final String description;

    public Species(String genusName, String speciesName, int numChromosomes2n, int basicNumChromosomesx, String description) {
        this.genusName = genusName;
        this.speciesName = speciesName;
        this.numChromosomes2n = numChromosomes2n;
        this.basicNumChromosomesx = basicNumChromosomesx;
        this.description = description;
    }

    public String getFullName() {
        return genusName + " " + speciesName;
    }

    public int getHaploidNumChromosomes() {
        return numChromosomes2n / 2;
    }

    public String getAllData() {
        return "Genus name: " + genusName + "\n" +
                "Species name: " + speciesName + "\n" +
                "Number of chromosomes 2n: " + numChromosomes2n + "\n" +
                "Basic number of chromosomes x: " + basicNumChromosomesx + "\n" +
                "Description: " + description + "\n";
    }

    public Species clone() {
        return new Species(genusName, speciesName, numChromosomes2n, basicNumChromosomesx, description);
    }
}