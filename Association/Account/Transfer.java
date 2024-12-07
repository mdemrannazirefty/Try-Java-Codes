class Transfer{
Account a1 ;
Account a2 ;
void Transfer(int amount,Account a1,Account a2){
a1.balance=a1.balance-amount;
a2.balance=a2.balance+amount;}}