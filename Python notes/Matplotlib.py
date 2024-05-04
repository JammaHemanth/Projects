import matplotlib
print("Matplotlib Version: ",matplotlib.__version__) 

import matplotlib.pyplot as plt
import numpy as np
xpoints = np.array([0,6])
ypoints = np.array([0,250])
plt.plot(xpoints,ypoints)
plt.show()

import matplotlib.pyplot as plt
import numpy as np
ypoints = np.array([3,8,1,10])
plt.plot(ypoints, marker = 'o')
plt.show()


import matplotlib.pyplot as plt
import numpy as np
ypoints = np.array([3,8,1,10])
plt.plot(ypoints, marker = '*') #Points as * symbol
plt.show()

import matplotlib.pyplot as plt
import numpy as np
ypoints = np.array([3, 8, 1, 10])
plt.plot(ypoints, 'o:r') #Points as : symbol with dotted lines
plt.plot(ypoints, 'o-r') #Points as : symbol with dotted lines
plt.plot(ypoints, 'o--r') #Points as : symbol with dotted lines
plt.plot(ypoints, 'o-.r') #Points as : symbol with dotted lines
plt.show()
plt.show()
plt.show()
plt.show()
