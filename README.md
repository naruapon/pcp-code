# PCP - หลักการเขียนโปรแกรมคอมพิวเตอร์ (Principles of Computer Programming)

โปรเจกต์นี้รวบรวมตัวอย่างโค้ดภาษา Java สไลด์ประกอบการสอน และเอกสารคำสอน สำหรับวิชา PCP (Principles of Computer Programming) โดยจัดแบ่งเนื้อหาตามบทเรียนทั้ง 9 บท อ้างอิงจากเอกสารคำสอน `ebook/java-pcp-26.pdf`

## โครงสร้างโปรเจกต์

```
pcp-code/
├── 1/   - บทที่ 1: ระบบคอมพิวเตอร์และองค์ประกอบพื้นฐาน (ทฤษฎี)
├── 2/   - บทที่ 2: แนวคิดเชิงคำนวณและการออกแบบขั้นตอนวิธี (ทฤษฎี)
├── 3/   - บทที่ 3: ภาษาคอมพิวเตอร์ (ทฤษฎี)
├── 4/   - บทที่ 4: แนะนำภาษา Java และสภาพแวดล้อมการพัฒนา
├── 5/   - บทที่ 5: ส่วนประกอบของโปรแกรม Java และชนิดข้อมูล
├── 6/   - บทที่ 6: การรับและแสดงผลข้อมูล (I/O)
├── 7/   - บทที่ 7: โครงสร้างคำสั่งควบคุมแบบทางเลือก (if-else, switch)
├── 8/   - บทที่ 8: โครงสร้างคำสั่งควบคุมแบบทำซ้ำ (for, while, do-while)
├── 9/   - บทที่ 9: การพัฒนาโปรแกรมแบบมีโครงสร้างและการสร้างโปรแกรมย่อย (Method)
├── ebook/     - เอกสารคำสอน (PDF)
├── slide6-9/  - สไลด์ประกอบการสอน บทที่ 6-9
└── chatbot/   - ไฟล์สำหรับ Chatbot
```

## เนื้อหาแต่ละบท

### บทที่ 1 - ระบบคอมพิวเตอร์และองค์ประกอบพื้นฐาน (ทฤษฎี)
- ความหมายและวิวัฒนาการของคอมพิวเตอร์
- คุณสมบัติและบทบาทของคอมพิวเตอร์ในชีวิตประจำวัน
- องค์ประกอบของระบบคอมพิวเตอร์
- โครงสร้างและการทำงานของคอมพิวเตอร์ (Input–Process–Output–Storage)
- การแทนข้อมูลในคอมพิวเตอร์
- ระบบเลขฐานที่ใช้ในคอมพิวเตอร์

### บทที่ 2 - แนวคิดเชิงคำนวณและการออกแบบขั้นตอนวิธี (ทฤษฎี)
- แนวคิดเชิงคำนวณและการแก้ปัญหาเชิงคำนวณ
- ความหมายของขั้นตอนวิธีและลักษณะของขั้นตอนวิธีที่ดี
- การวิเคราะห์ปัญหาและขั้นตอนวิธี
- การวิเคราะห์ปัญหาและขั้นตอนวิธีด้วยรหัสลำลอง (Pseudocode)
- การวิเคราะห์ปัญหาและขั้นตอนวิธีด้วยผังงาน (Flowchart)

### บทที่ 3 - ภาษาคอมพิวเตอร์ (ทฤษฎี)
- ความหมายของภาษาคอมพิวเตอร์
- ประเภทของภาษาคอมพิวเตอร์ (ระดับต่ำ ระดับกลาง ระดับสูง)
- ความจำเป็นของการแปลภาษาคอมพิวเตอร์
- การแปลภาษาคอมพิวเตอร์ (Compiler vs Interpreter)
- บทบาทของภาษาคอมพิวเตอร์ต่อการพัฒนาเทคโนโลยีในปัจจุบัน

### บทที่ 4 - แนะนำภาษา Java และสภาพแวดล้อมการพัฒนา
- `HelloWorld.java` — โปรแกรมแรกในภาษา Java

> เนื้อหาในบท: ภาพรวมของภาษา Java, สถาปัตยกรรม Java (JVM/JRE/JDK), การติดตั้งและตั้งค่าสภาพแวดล้อม, เครื่องมือสำหรับเขียนโปรแกรม, โครงสร้างพื้นฐานของโปรแกรม Java, ขั้นตอนการคอมไพล์และรันโปรแกรม

### บทที่ 5 - ส่วนประกอบของโปรแกรม Java และชนิดข้อมูล
- `CaseSensitiveExample.java` — ตัวอย่างความสำคัญของตัวพิมพ์เล็ก-ใหญ่
- `ExplicitCastingExample.java` — ตัวอย่างการแปลงชนิดข้อมูลแบบ Explicit Casting
- `PracticalExplicitCasting.java` — ตัวอย่างการใช้งาน Explicit Casting ในทางปฏิบัติ

> เนื้อหาในบท: ส่วนประกอบพื้นฐานของโปรแกรม Java, ตัวแปรและค่าคงที่, ชนิดข้อมูลในภาษา Java, การแปลงชนิดข้อมูล, ตัวดำเนินการ

### บทที่ 6 - การรับและแสดงผลข้อมูล
- `PrintExample.java` — การใช้ `print()`
- `PrintlnExample.java` — การใช้ `println()`
- `PrintfBasic.java` — การใช้ `printf()` เบื้องต้น
- `DecimalControl.java` — การควบคุมทศนิยม
- `StringFormat.java` — การจัดรูปแบบข้อความ
- `TabExample.java` — การใช้ Tab ในการจัดรูปแบบ
- `NewlineExample.java` — การใช้ `\n` ในการขึ้นบรรทัดใหม่
- `ScannerIntro.java` — แนะนำ Scanner สำหรับรับข้อมูล
- `NextExample.java` — การใช้ `next()`
- `NextLineExample.java` — การใช้ `nextLine()`
- `CloseScanner.java` — การปิด Scanner
- `BasicExceptionHandling.java` — การจัดการข้อผิดพลาดเบื้องต้น
- `TryWithResources.java` — การใช้ try-with-resources

> เนื้อหาในบท: การแสดงผลด้วย System.out, การต่อข้อความและค่าตัวแปร, การรับข้อมูลด้วย Scanner, การปิด Scanner และแนวปฏิบัติที่ดี

### บทที่ 7 - โครงสร้างคำสั่งควบคุมแบบทางเลือก
- `CheckNumber.java` — ตรวจสอบจำนวน (บวก/ลบ/ศูนย์)
- `EvenOddChecker.java` — ตรวจสอบเลขคู่-เลขคี่
- `ScoreChecker.java` — ตรวจสอบเกรดจากคะแนน
- `BasicSwitchExample.java` — การใช้ switch-case เบื้องต้น
- `StringSwitchExample.java` — การใช้ switch กับ String

> เนื้อหาในบท: แนวคิดการตัดสินใจในโปรแกรม, นิพจน์เชิงเงื่อนไข, คำสั่ง if / if-else / if-else-if / nested if, คำสั่ง switch, การเลือกใช้โครงสร้างให้เหมาะสม

### บทที่ 8 - โครงสร้างคำสั่งควบคุมแบบทำซ้ำ

**For Loop:**
- `CountingExample.java` — การนับเลข
- `SumCalculation.java` — การคำนวณผลรวม
- `Countdown.java` — การนับถอยหลัง
- `EvenNumbers.java` — แสดงเลขคู่
- `TwoDimensionalTable.java` — ตารางสองมิติ (Nested for)
- `SumAndAverage.java` — ผลรวมและค่าเฉลี่ย

**While Loop:**
- `BasicWhileLoop.java` — while loop เบื้องต้น
- `SumWithWhile.java` — คำนวณผลรวมด้วย while
- `NestedWhileLoop.java` — while ซ้อน while
- `AgeValidation.java` — ตรวจสอบอายุด้วย while

**Do-While Loop:**
- `BasicDoWhileLoop.java` — do-while เบื้องต้น
- `SumWithDoWhile.java` — คำนวณผลรวมด้วย do-while
- `DoWhileAlwaysExecute.java` — do-while ทำงานอย่างน้อย 1 รอบ
- `NestedDoWhileLoop.java` — do-while ซ้อน
- `CalculatorMenu.java` — เมนูเครื่องคิดเลข

**Break, Continue, Return:**
- `BreakInForLoop.java` — การใช้ break
- `ContinueInForLoop.java` — การใช้ continue
- `ReturnInLoop.java` — การใช้ return ในลูป
- `BreakWithLabel.java` — การใช้ break กับ label

> เนื้อหาในบท: แนวคิดการทำงานซ้ำ, องค์ประกอบพื้นฐานของลูป, คำสั่ง for / while / do-while, คำสั่งควบคุมลูป (break, continue), ลูปซ้อนลูป, ลูปไม่สิ้นสุดและข้อควรระวัง

### บทที่ 9 - การพัฒนาโปรแกรมแบบมีโครงสร้างและการสร้างโปรแกรมย่อย

**ตัวอย่าง Class & Object:**
- `StudentDemo.java` — ตัวอย่างการสร้างและใช้งาน Object (นักศึกษา)
- `Student.java` — คลาส Student
- `BankAccount.java` — ระบบบัญชีธนาคาร
- `NewBankAccount.java` — ระบบบัญชีธนาคาร (ปรับปรุง)
- `BankingSystem.java` — ระบบธนาคาร
- `Employee.java` — ระบบข้อมูลพนักงาน
- `CompanySystem.java` — ระบบบริษัท

**ตัวอย่าง Method:**
- `MethodExample.java` — ตัวอย่างการสร้าง Method
- `MethodTypesDemo.java` — ตัวอย่างประเภทของ Method (void / return)
- `MathUtility.java` — ตัวอย่างการสร้างไลบรารีเมธอดคำนวณ
- `PassByValueExample.java` — การส่งค่าแบบ Pass by Value
- `PassByReferenceExample.java` — การส่งค่าแบบ Pass by Reference

**ตัวอย่างโปรแกรมประยุกต์:**
- `LibBook.java` — คลาสหนังสือ
- `LibrarySystem.java` — ระบบห้องสมุด
- `MainLibrarySystem.java` — โปรแกรมหลักระบบห้องสมุด

> เนื้อหาในบท: แนวคิดการพัฒนาโปรแกรมแบบมีโครงสร้าง, โปรแกรมย่อย (Method), พารามิเตอร์และค่าตอบกลับ, ขอบเขตของตัวแปร, Pass by Value, Encapsulation, Class & Object, การออกแบบโปรแกรมโดยใช้เมธอด

## สื่อประกอบการสอน

### เอกสารคำสอน (`ebook/`)
- `java-pcp-26.pdf` — เอกสารคำสอนวิชาหลักการเขียนโปรแกรมคอมพิวเตอร์ (9 บท, 261 หน้า)
- `ปกเอกสารคำสอน.pdf` — หน้าปก
- `คำนำ-v13.pdf` — คำนำ

### สไลด์ประกอบการสอน (`slide6-9/`)
- `ch6.pptx` — บทที่ 6: การรับและแสดงผลข้อมูล
- `ch7.pptx` — บทที่ 7: โครงสร้างคำสั่งควบคุมแบบทางเลือก
- `ch8-up.pptx` — บทที่ 8: โครงสร้างคำสั่งควบคุมแบบทำซ้ำ
- `ch9-up-2.pptx` — บทที่ 9: การพัฒนาโปรแกรมแบบมีโครงสร้างและการสร้างโปรแกรมย่อย
- `sum6-9.pptx` — สรุปบทที่ 6-9

### เอกสารอื่น ๆ
- `pcp-tqf03.pdf` — มคอ.3 รายวิชา PCP
- `np-timetable-2-68.pdf` — ตารางเรียน

## วิธีใช้งาน

### ความต้องการ
- Java Development Kit (JDK) 8 ขึ้นไป

### คอมไพล์และรันโปรแกรม
```bash
# คอมไพล์
javac ชื่อไฟล์.java

# รัน
java ชื่อคลาส
```

ตัวอย่าง:
```bash
cd 4
javac HelloWorld.java
java HelloWorld
```
