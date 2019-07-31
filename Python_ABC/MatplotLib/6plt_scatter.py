import matplotlib.pyplot as plt
x = [1,1.5,2,2.5,3,3.5,4]
y = [7.5,8,8.5,9,9.5,10,10.5]
 
x1=[8,8.5,9,9.5,10,10.5,11]
y1=[3,3.5,3.7,4,4.5,5,5.2]
 
plt.scatter(x,y, label='Red Dots',color='r')
plt.scatter(x1,y1,label='Blue Dots',color='b')

plt.xlabel('X-axis')
plt.ylabel('y-axis')

plt.title('Scatter Plot')

plt.legend()
plt.show()
