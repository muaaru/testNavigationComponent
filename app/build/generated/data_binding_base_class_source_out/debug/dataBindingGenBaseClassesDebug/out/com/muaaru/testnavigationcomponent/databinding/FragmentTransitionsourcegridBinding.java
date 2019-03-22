package com.muaaru.testnavigationcomponent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.muaaru.testnavigationcomponent.grid.dummy.DummyContent;

public abstract class FragmentTransitionsourcegridBinding extends ViewDataBinding {
  @NonNull
  public final TextView content;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView itemNumber;

  @Bindable
  protected DummyContent.DummyItem mItem;

  protected FragmentTransitionsourcegridBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView content, ImageView imageView, TextView itemNumber) {
    super(_bindingComponent, _root, _localFieldCount);
    this.content = content;
    this.imageView = imageView;
    this.itemNumber = itemNumber;
  }

  public abstract void setItem(@Nullable DummyContent.DummyItem item);

  @Nullable
  public DummyContent.DummyItem getItem() {
    return mItem;
  }

  @NonNull
  public static FragmentTransitionsourcegridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTransitionsourcegridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTransitionsourcegridBinding>inflate(inflater, com.muaaru.testnavigationcomponent.R.layout.fragment_transitionsourcegrid, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTransitionsourcegridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTransitionsourcegridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTransitionsourcegridBinding>inflate(inflater, com.muaaru.testnavigationcomponent.R.layout.fragment_transitionsourcegrid, null, false, component);
  }

  public static FragmentTransitionsourcegridBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTransitionsourcegridBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTransitionsourcegridBinding)bind(component, view, com.muaaru.testnavigationcomponent.R.layout.fragment_transitionsourcegrid);
  }
}
