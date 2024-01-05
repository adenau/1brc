/*
 *  Copyright 2023 The original authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package dev.morling.onebrc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

public class CalculateAverage_adenau {

    // record Result(double min, double max, double sum, long count) {
    // }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        long start = System.currentTimeMillis();
        String line;
        String[] record;

        BufferedReader reader = new BufferedReader(new FileReader("./measurements.txt"));

        while ((line = reader.readLine()) != null) {

            record = line.split(";");
            System.out.println(record[0]);
        }

        reader.close();
    }
}
