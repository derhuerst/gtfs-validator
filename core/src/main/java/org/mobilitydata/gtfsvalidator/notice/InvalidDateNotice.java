/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mobilitydata.gtfsvalidator.notice;

/**
 * A field cannot be parsed as date.
 *
 * <p>Dates must have the YYYYMMDD format.
 *
 * <p>Example: {@code 20180913} for September 13th, 2018.
 *
 * <p>Severity: {@code SeverityLevel.ERROR}
 */
public class InvalidDateNotice extends ValidationNotice {

  // The name of the faulty file.
  private final String filename;

  // The row of the faulty record.
  private final int csvRowNumber;

  // Faulty record's field name.
  private final String fieldName;

  // Faulty value.
  private final String fieldValue;

  public InvalidDateNotice(String filename, int csvRowNumber, String fieldName, String fieldValue) {
    super(SeverityLevel.ERROR);
    this.filename = filename;
    this.csvRowNumber = csvRowNumber;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }
}
