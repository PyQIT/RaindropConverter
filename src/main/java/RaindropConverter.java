class RaindropConverter {

    String convert(int number) {

        int counter = 0;
        int num = 0;
        String value = "";

        for(int i = 1; i <= number; i++) {
            if (number % i == 0)
                counter++;
        }

        int[] dividers = new int[counter];

        int a = 0;
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividers[a] = i;
                a++;
            }
        }

        for(int i = 0; i < dividers.length; i++ )
            System.out.println(dividers[i]);

        for(int i = 0; i < dividers.length; i++){
            if(dividers[i] == 3) {
                value = value + "Pling";
                num++;
            }
            else if(dividers[i] == 5) {
                value = value + "Plang";
                num++;
            }
            else if(dividers[i] == 7) {
                value = value + "Plong";
                num++;
            }
            if(num == 0 && i == dividers.length-1)
                value = Integer.toString(dividers[dividers.length-1]);
        }

        return value;
    }
}
/*
class RaindropConverter {

    String convert(int number) {
        String Sound="";

        if (number%3==0)
            Sound+="Pling";

        if (number%5==0)
            Sound+="Plang";

        if (number%7==0)
            Sound+="Plong";

        if (Sound.isEmpty())
            Sound = Integer.toString(number);

        return Sound;
    }

}*/