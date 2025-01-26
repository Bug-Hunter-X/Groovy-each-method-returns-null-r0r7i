def list = [1, 2, 3, 4, 5]

def doubledList = list.collect { it * 2 }

println doubledList

//Alternative solution using a loop:
def doubledList2 = []
for(item in list) {
doubledList2 << item * 2
}

println doubledList2
//Expected output: [2, 4, 6, 8, 10]
//Actual output: [2, 4, 6, 8, 10]