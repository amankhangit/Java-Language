# Pseudocode
Start\n
Input num1, num2\n
a = num1\n
b = num2\n
while b != 0\n
	t = b\n
	b = a%b\n
	a = t\n
exit while\n	
hcf = a\n
output hcf\n
lcm = (x*y)/hcf\n
output lcm\n
exit
