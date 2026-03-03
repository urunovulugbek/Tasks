public class MyTime {
    private int hour;
    private int minute;
    private int second;


    public void validate(int hour, int minute, int second) {
        if (hour<24&&hour>0) {
            this.hour = hour;
        } if (minute<60&&minute>0) {
            this.minute = minute;
        } if (second<60&&second>0) {
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }
    public MyTime() {};
    public MyTime(int hour, int minute, int second) {
        if (hour<24&&hour>0) {
            this.hour = hour;
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        } if (minute<60&&minute>0) {
            this.minute = minute;
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        } if (second<60&&second>0) {
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (hour<24&&hour>0) {
            this.hour = hour;
        } else {
            System.out.println("Yaroqsiz soat!");
        } if (minute<60&&minute>0) {
            this.minute = minute;
        } else {
            System.out.println("Yaroqsiz daqiqa!");
        } if (second<60&&second>0) {
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soniya!");
        }    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour<25&&hour>0) {
            this.hour = hour;
        } else {
            System.out.println("Yaroqsiz soat!");
        }
    }

    public void setMinute(int minute) {
        if (minute<61&&minute>0) {
            this.minute = minute;
        } else {
            System.out.println("Yaroqsiz minut!");
        }
    }

    public void setSecond(int second) {
        if (second<61&&second>0) {
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soniya!");
        }
    }

    @Override
    public String toString() {
        String thisHour = String.valueOf(hour);
        String thisMinute = String.valueOf(minute);
        String thisSecond = String.valueOf(second);

        if (hour<10) {
            thisHour = "0" + hour;
        } if (minute<10) {
            thisMinute = "0" + minute;
        } if (second<10) {
            thisSecond = "0" + second;
        }

        return thisHour + ":" + thisMinute + ":" + thisSecond;
    }

    public MyTime nextSecond() {
        second++;

        if (second >= 60) {
            second = 0;
            minute++;

            if (minute >= 60) {
                minute = 0;
                hour++;

                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this; // 5. O'zgargan ob'ektning o'zini qaytaramiz
    }

    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;

            if (hour >= 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;

        if (second >= 60) {
            second = 0;
            minute--;

            if (minute >= 60) {
                minute = 0;
                hour--;

                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute >= 60) {
            minute = 0;
            hour--;

            if (hour >= 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }




}
