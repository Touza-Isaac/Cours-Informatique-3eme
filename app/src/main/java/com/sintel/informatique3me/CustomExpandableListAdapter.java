package com.sintel.informatique3me;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomExpandableListAdapter extends BaseExpandableListAdapter {
    private Context  context;
    private List<String> expandableListTitle;
    private HashMap<String,List<String>> expandableListDetail;

    public CustomExpandableListAdapter(Context context, List<String>expandableListTitle, HashMap<String,List<String>>expandableListDetail){
        this.context=context;
        this.expandableListTitle=expandableListTitle;
        this.expandableListDetail=expandableListDetail;
    }

    @Override
    public int getGroupCount() {
        return this.expandableListTitle.size();
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.expandableListTitle.get(listPosition);
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).get(expandedListPosition);
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public long getChildId(int ListPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String expandedListDetailText =(String) getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_group,null);
        }
        TextView expandabletextView = (TextView)convertView.findViewById(R.id.listTitle);
        expandabletextView.setText(expandedListDetailText);
        return convertView;
    }

    @Override
    public View getChildView(int ListPosition, final int expandedListPosition, boolean isLastChild, View convertView, ViewGroup parent) {
       final String expandedListText = (String) getChild(ListPosition,expandedListPosition);
       if(convertView==null){
           LayoutInflater layoutInflater =(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView=layoutInflater.inflate(R.layout.list_item,null);
       }
        TextView expendedListTextView=(TextView) convertView.findViewById(R.id.expanded_list_item);
        expendedListTextView.setText(expandedListText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }
}
