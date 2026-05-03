class Solution {
public:
    vector<int> seg;
    int build(int node,int left,int right,vector<int>&heights){
         if(left==right){
            return seg[node]=heights[left];
         }
        int mid=(left+right)/2;
        int l=build(2*node+1,left,mid,heights);
        int r=build(2*node+2,mid+1,right,heights);
        return seg[node]=min(l,r);
    }
    int find(int node,int left,int right,int l,int r){
        if(r<left||l>right) return INT_MAX;
        if(l>=left&&r<=right) return seg[node];
        int mid=(l+r)/2;
        int le=find(2*node+1,left,right,l,mid);
        int ri=find(2*node+2,left,right,mid+1,r);
        return min(le,ri);
    }
    // for nearest right bar
    int sol(int l,int r,int val,int n){
        int ans;
        while(l<=r){
            int mid=l+(r-l)/2;
            int mn=find(0,l,mid,0,n-1);
            if(mn<val) {
               ans=mid;
               r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    // for nearest left bar 
    int soll(int l,int r,int val,int n){
        int ans;
        while(l<=r){
            int mid=l+(r-l)/2;
            int mn=find(0,mid,r,0,n-1);
            if(mn<val) {
               ans=mid;
               l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    int largestRectangleArea(vector<int>& heights) {
        int n=heights.size();
        seg.resize(4*n);
        build(0,0,n-1,heights);
        long long ans=0;
        for(int i=0;i<n;i++){
            int r;
            int l;// if min at right side is greater than equal to current bar then r=n
            if(find(0,i,n-1,0,n-1)>=heights[i]) r=n;
            else 
            r=sol(i,n-1,heights[i],n);
            if(find(0,0,i,0,n-1)>=heights[i]) l=-1;
            else 
            l=soll(0,i,heights[i],n);
            ans=max(ans,(long long)(r-l-1)*heights[i]);
        }
        return (int)ans;
    }
};