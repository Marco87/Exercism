class SpaceAge {

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds()/(31557600);
    }

    double onMercury() {
        return getSeconds()/(31557600*0.2408467);
    }

    double onVenus() {
        return getSeconds()/(31557600*0.61519726);
    }

    double onMars() {
        return getSeconds()/(31557600*1.8808158);
    }

    double onJupiter() {
        return getSeconds()/(31557600*11.862615);
    }

    double onSaturn() {
        return getSeconds()/(31557600*29.447498);
    }

    double onUranus() {
        return getSeconds()/(31557600*84.016846);
    }

    double onNeptune() {
        return getSeconds()/(31557600*164.79132);
    }

}
