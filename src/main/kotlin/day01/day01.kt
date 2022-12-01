package day01

import utils.FileReader

object Day01 {
    fun part1(){
        val lines: List<String> = FileReader.readFileLines("day01/input_day01");
        var mostCalories: Int = 0;
        var buffer = 0;
        for (line in lines){
            if(line.isNotEmpty()){
                buffer += Integer.parseInt(line);
            } else {
                if(buffer > mostCalories){
                    mostCalories = buffer;
                }
                buffer = 0;
            }
        }
        println(mostCalories);
    }

    fun part2(){
        val lines: List<String> = FileReader.readFileLines("day01/input_day01");
        val top3: ArrayList<Int> = arrayListOf();
        var buffer = 0;
        for (line in lines){
            if(line.isNotEmpty()){
                buffer += Integer.parseInt(line);
            } else {
                if(top3.size < 3){
                    top3.add(buffer);
                } else {
                    val min = top3.min();
                    if (min < buffer){
                        top3.remove(min);
                        top3.add(buffer);
                    }
                }
                buffer = 0;
            }
        }
        println(top3.toList().sum());
    }


}

fun main() {
    println("**** PART 1 ****")
    Day01.part1();

    println("**** PART 2 ****")
    Day01.part2();
}