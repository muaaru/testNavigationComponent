package com.muaaru.testnavigationcomponent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentTransitionDestinationGridBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  protected FragmentTransitionDestinationGridBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
  }

  @NonNull
  public static FragmentTransitionDestinationGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTransitionDestinationGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTransitionDestinationGridBinding>inflate(inflater, com.muaaru.testnavigationcomponent.R.layout.fragment_transition_destination_grid, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTransitionDestinationGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTransitionDestinationGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTransitionDestinationGridBinding>inflate(inflater, com.muaaru.testnavigationcomponent.R.layout.fragment_transition_destination_grid, null, false, component);
  }

  public static FragmentTransitionDestinationGridBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTransitionDestinationGridBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTransitionDestinationGridBinding)bind(component, view, com.muaaru.testnavigationcomponent.R.layout.fragment_transition_destination_grid);
  }
}
