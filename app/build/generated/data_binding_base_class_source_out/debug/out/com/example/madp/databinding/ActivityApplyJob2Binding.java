// Generated by view binder compiler. Do not edit!
package com.example.madp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.madp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityApplyJob2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button12;

  @NonNull
  public final Button button14;

  @NonNull
  public final Button button16;

  @NonNull
  public final TextView editTextTextPersonName15;

  @NonNull
  public final EditText editTextTextPersonName16;

  @NonNull
  public final EditText editTextTextPersonName17;

  @NonNull
  public final EditText editTextTextPersonName18;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView29;

  @NonNull
  public final TextView textView30;

  @NonNull
  public final TextView textView31;

  @NonNull
  public final TextView textView32;

  @NonNull
  public final TextView textView6;

  private ActivityApplyJob2Binding(@NonNull ConstraintLayout rootView, @NonNull Button button12,
      @NonNull Button button14, @NonNull Button button16,
      @NonNull TextView editTextTextPersonName15, @NonNull EditText editTextTextPersonName16,
      @NonNull EditText editTextTextPersonName17, @NonNull EditText editTextTextPersonName18,
      @NonNull ImageView imageView, @NonNull TextView textView29, @NonNull TextView textView30,
      @NonNull TextView textView31, @NonNull TextView textView32, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.button12 = button12;
    this.button14 = button14;
    this.button16 = button16;
    this.editTextTextPersonName15 = editTextTextPersonName15;
    this.editTextTextPersonName16 = editTextTextPersonName16;
    this.editTextTextPersonName17 = editTextTextPersonName17;
    this.editTextTextPersonName18 = editTextTextPersonName18;
    this.imageView = imageView;
    this.textView29 = textView29;
    this.textView30 = textView30;
    this.textView31 = textView31;
    this.textView32 = textView32;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityApplyJob2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityApplyJob2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_apply_job2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityApplyJob2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button12;
      Button button12 = ViewBindings.findChildViewById(rootView, id);
      if (button12 == null) {
        break missingId;
      }

      id = R.id.button14;
      Button button14 = ViewBindings.findChildViewById(rootView, id);
      if (button14 == null) {
        break missingId;
      }

      id = R.id.button16;
      Button button16 = ViewBindings.findChildViewById(rootView, id);
      if (button16 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName15;
      TextView editTextTextPersonName15 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName15 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName16;
      EditText editTextTextPersonName16 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName16 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName17;
      EditText editTextTextPersonName17 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName17 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName18;
      EditText editTextTextPersonName18 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName18 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textView29;
      TextView textView29 = ViewBindings.findChildViewById(rootView, id);
      if (textView29 == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = ViewBindings.findChildViewById(rootView, id);
      if (textView30 == null) {
        break missingId;
      }

      id = R.id.textView31;
      TextView textView31 = ViewBindings.findChildViewById(rootView, id);
      if (textView31 == null) {
        break missingId;
      }

      id = R.id.textView32;
      TextView textView32 = ViewBindings.findChildViewById(rootView, id);
      if (textView32 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityApplyJob2Binding((ConstraintLayout) rootView, button12, button14, button16,
          editTextTextPersonName15, editTextTextPersonName16, editTextTextPersonName17,
          editTextTextPersonName18, imageView, textView29, textView30, textView31, textView32,
          textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
