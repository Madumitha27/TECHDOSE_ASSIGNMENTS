class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        l=[]
        l.append(intervals[0])
        index=0
        for i in intervals[1:]:
            if i[0]<=l[index][1]:
                if l[index][1]<i[1]:
                    l[index][1]=i[1]
            else:
                l.append(i)
                index+=1
        return l