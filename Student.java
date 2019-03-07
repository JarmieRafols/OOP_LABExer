public class Student {

    public static int idNum, creditHours, points;
    public static double gpa;

        public void setidNumber(int idnumber) {
            this.idNum = idnumber;
        }

        public void setcreditHoursEarned(int hours) {
            this.creditHours = hours;
        }

        public void setPointsEarned (int points1) {
            this.points = points1;
        }

        public int getIdNum() {
            return idNum;
        }
        public int getCreditHours() {
            return creditHours;
        }
        public int getPoints() {
            return points;
            }

        public double getGpa(int points, int creditHours){
            gpa = points / creditHours;
            return gpa;
        }
        }

