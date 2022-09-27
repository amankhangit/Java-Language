# Pseudocode
  Start
  Input num1, num2
  a = num1
  b = num2
  while b != 0
	t = b
	b = a%b
	a = t
  exit while
  hcf = a
  output hcf
  lcm = (x*y)/hcf
  output lcm
  exit
