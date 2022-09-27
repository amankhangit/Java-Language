# Pseudocode
Start<br>
Input num1, num2<br>
a = num1<br>
b = num2<br>
while b != 0<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;t = b<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b = a%b<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;a = t<br>
exit while<br>
hcf = a<br>
output hcf<br>
lcm = (x*y)/hcf<br>
output lcm<br>
exit<br>
