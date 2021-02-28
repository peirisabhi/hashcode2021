/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode2021.models;

/**
 *
 * @author abhi
 */
    public class Street {

        private int startIntersections;
        private int endIntersections;
        private String street;
        private int time;

        public Street(int startIntersections, int endIntersections, String street, int time) {
            this.startIntersections = startIntersections;
            this.endIntersections = endIntersections;
            this.street = street;
            this.time = time;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getStartIntersections() {
            return startIntersections;
        }

        public void setStartIntersections(int startIntersections) {
            this.startIntersections = startIntersections;
        }

        public int getEndIntersections() {
            return endIntersections;
        }

        public void setEndIntersections(int endIntersections) {
            this.endIntersections = endIntersections;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

    @Override
    public String toString() {
        return "Street{" + "startIntersections=" + startIntersections + ", endIntersections=" + endIntersections + ", street=" + street + ", time=" + time + '}';
    }
        
        

    }
