package com.brainyata.solver;

import com.brainyata.util.Util;

public class Main {
  public static void main(String[] args) {
    String[] files = {"a_an_example.in.txt", "b_basic.in.txt", "c_coarse.in.txt", "d_difficult.in.txt", "e_elaborate.in.txt"};
    for (String fileName : files) {
      var fileLines = Util.readLines(fileName);
      var solution = new SolutionOne().solve(fileLines);
      Util.writingToFile(solution, fileName);
    }
  }
}
