public static int[] DoCalc(int[] numbers){
    int[] minmax = {numbers[0], numbers[0]};
    for(int i = 0; i < numbers.length; i++){
        if(numbers[i] > minmax[1]){
            minmax[1] = numbers[i];
        }
    }
    for(int i = 0; i < numbers.length; i++){
        if(numbers[i] < minmax[0]){
            minmax[0] = numbers[i];
        }
    }
    return minmax;
}