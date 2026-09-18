# Canteen Ordering System

A Java console application activity in OOP designed to process customer orders for a canteen menu, validate user inputs, handle tiered discount structures, and generate itemized transaction summaries.

## 📊 Menu & Pricing

| Item No. | Item Name | Price |
| :---: | :--- | :---: |
| **1** | Burger | $80.00 |
| **2** | Pizza | $120.00 |
| **3** | Pasta | $100.00 |
| **4** | Sandwich | $70.00 |
| **5** | Milk Tea | $90.00 |

---

## 🏷️ Discount Rules

- Student Discount**: 10% off
- Bulk Discount** ($\ge \$500$ order): 5% off
- Combined Student & Bulk Discount** (Student with order $\ge \$500$): 15% off
- Regular Orders**: No discount

---

=====   M E N U   =====
1. Burger      - $80.00
2. Pizza       - $120.00
3. Pasta       - $100.00
4. Sandwich    - $70.00
5. Milk Tea    - $90.00

Enter item number: 2
Enter quantity: 3
Are you a student? (Y/N): 

Subtotal: $360.00
Discount: $36.00
Order total: $324.00

Do you want to order again? (Y/N): N

===== ORDER SUMMARY =====
Total items: 3
Total before discount: $360.00
Total discount: $36.00
Final amount: $324.00
Thank you for ordering!
